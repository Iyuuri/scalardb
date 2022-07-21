package sample;

import com.scalar.db.api.DistributedTransaction;
import com.scalar.db.api.DistributedTransactionManager;
import com.scalar.db.api.Get;
import com.scalar.db.api.Put;
import com.scalar.db.api.Result;
import com.scalar.db.exception.transaction.TransactionException;
import com.scalar.db.io.Key;
import com.scalar.db.service.TransactionFactory;
import java.io.IOException;
import java.util.Optional;

public class testWithTransaction extends test {

  private final DistributedTransactionManager manager;

  public testWithTransaction() throws IOException {
    TransactionFactory factory = new TransactionFactory(dbConfig);
    manager = factory.getTransactionManager();
  }

  @Override
  public void add1(String id, String productname,String registration_date,int price,String address) throws TransactionException {
    // Start a transaction
    DistributedTransaction tx = manager.start();
    try {
      Get get = new Get(new Key(ID, id)).forNamespace(NAMESPACE).forTable(TABLENAME);
      Optional<Result> result = tx.get(get);
      if(result.isPresent()){
          System.out.println("this item is already selling.");
      }
      else{
        // registrate item
        Put put = new Put(new Key(ID, id)).withValue(PRODUCTNAME, productname).withValue(regidate, registration_date).withValue(PRICE, price).withValue(ADDRESS, address).withValue(ISSOLD,0).forNamespace(NAMESPACE).forTable(TABLENAME);
        tx.put(put);
      }
      // Commit the transaction (records are automatically recovered in case of failure)
      tx.commit();
    } catch (Exception e) {
      tx.abort();
      throw e;
    }       
  }
  @Override
  public void add2(String id, String productname,String registration_date,int price,String address) throws TransactionException {
    // Start a transaction
    DistributedTransaction tx = manager.start();
    try {
      Get get = new Get(new Key(ID, id)).forNamespace(NAMESPACE2).forTable(TABLENAME);
      Optional<Result> result = tx.get(get);
      if(result.isPresent()){
          System.out.println("This item is already selling.");
      }
      else{
        // registrate item
        Put put = new Put(new Key(ID, id)).withValue(PRODUCTNAME, productname).withValue(regidate, registration_date).withValue(PRICE, price).withValue(ADDRESS, address).withValue(ISSOLD,0).forNamespace(NAMESPACE2).forTable(TABLENAME);
        tx.put(put);
      }
      // Commit the transaction (records are automatically recovered in case of failure)
      tx.commit();
    } catch (Exception e) {
      tx.abort();
      throw e;
    }       
  }
  
  @Override
  public void sold1(String id) throws TransactionException {
    // Start a transaction
    DistributedTransaction tx = manager.start();

    try {
      // Retrieve the current balances for ids
      Get Get = new Get(new Key(ID, id)).forNamespace(NAMESPACE).forTable(TABLENAME);
      Get Get2 = new Get(new Key(ID, id)).forNamespace(NAMESPACE2).forTable(TABLENAME);
      Optional<Result> Result = tx.get(Get);
      Optional<Result> Result2 = tx.get(Get2);
      int is_sold=Result.get().getValue(ISSOLD).get().getAsInt();
      int is_sold2=Result2.get().getValue(ISSOLD).get().getAsInt();
      if(is_sold==1 || is_sold2==1){
          throw new TransactionException("The item is already sold.");
      }

      // Update the issold
      if(Result.isPresent()){
        Put Put = new Put(new Key(ID, id)).withValue(ISSOLD, 1).forNamespace(NAMESPACE).forTable(TABLENAME);
        tx.put(Put);
      }
      // Commit the transaction (records are automatically recovered in case of failure)
      tx.commit();
    } catch (Exception e) {
      tx.abort();
      System.out.println("A");
      throw e;
    }
  }
  @Override
  public void sold2(String id) throws TransactionException {
    // Start a transaction
    DistributedTransaction tx = manager.start();

    try {
      // Retrieve the current balances for ids
      Get Get = new Get(new Key(ID, id)).forNamespace(NAMESPACE).forTable(TABLENAME);
      Get Get2 = new Get(new Key(ID, id)).forNamespace(NAMESPACE2).forTable(TABLENAME);
      Optional<Result> Result = tx.get(Get);
      Optional<Result> Result2 = tx.get(Get2);
      int is_sold=Result.get().getValue(ISSOLD).get().getAsInt();
      int is_sold2=Result2.get().getValue(ISSOLD).get().getAsInt();
      
      if(is_sold==1 || is_sold2==1){
          throw new TransactionException("The item is already sold.");
      }

      // Update the issold
      if(Result2.isPresent()){
        Put Put = new Put(new Key(ID, id)).withValue(ISSOLD, 1).forNamespace(NAMESPACE2).forTable(TABLENAME);
        tx.put(Put);
      }
      // Commit the transaction (records are automatically recovered in case of failure)
      tx.commit();
    } catch (Exception e) {
      tx.abort();
      throw e;
    }
  }
  @Override
  public void getinstance(String id) throws TransactionException {
    // Start a transaction
    DistributedTransaction tx = manager.start();

    try {
      // Retrieve
      Get Get = new Get(new Key(ID, id)).forNamespace(NAMESPACE).forTable(TABLENAME);
      Get Get2 = new Get(new Key(ID, id)).forNamespace(NAMESPACE2).forTable(TABLENAME);
      Optional<Result> result = tx.get(Get);
      Optional<Result> result2 = tx.get(Get2);
      
      int [] sold = {0,0};
  
      if (result.isPresent()) {
        sold[0] = result.get().getValue(ISSOLD).get().getAsInt();
      }
      if (result2.isPresent()) {
        sold[1] = result2.get().getValue(ISSOLD).get().getAsInt();
      }
      if(!result.isPresent()&&!result2.isPresent()){
        System.out.println("The product is not selling.");
      }else{
        if(sold[0]==1){
          System.out.println("The item of " + id + " is sold in test.");
        }
        if(sold[1]==1){
          System.out.println("The item of " + id + " is sold in yahoo.");
        }
        if(sold[0]==0 && sold[1]==0){
          System.out.println("The item of " + id + " is now sell.");
        }
      }
      // Commit the transaction
      tx.commit();
    } catch (Exception e) {
      tx.abort();
      throw e;
    }
  }
  @Override
  public void close() {
    manager.close();
  }
}
