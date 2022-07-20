package sample;
import com.scalar.db.config.DatabaseConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class test {
  private static final String SCALARDB_PROPERTIES =
      System.getProperty("user.dir") + File.separator + "scalardb.properties";
  protected static final String NAMESPACE = "test1";
  protected static final String TABLENAME = "item";
  protected static final String ID = "id";
  protected static final String PRODUCTNAME = "product_name";
  protected static final String regidate = "registration_date";
  protected static final String ISSOLD = "is_sold";
  protected static final String PRICE = "price";
  protected static final String ADDRESS = "address";

  protected static final String NAMESPACE2 = "test2";
  
  protected DatabaseConfig dbConfig;

  public test() throws IOException {
    dbConfig = new DatabaseConfig(new FileInputStream(SCALARDB_PROPERTIES));
  }

  abstract void add1(String id, String productname,String registration_date,int price,String address) throws Exception;
  abstract void add2(String id, String productname,String registration_date,int price,String address) throws Exception;
  
  abstract void sold1(String id) throws Exception;
  abstract void sold2(String id) throws Exception;

  abstract int [] getinstance(String id) throws Exception;

  abstract void close();
}
