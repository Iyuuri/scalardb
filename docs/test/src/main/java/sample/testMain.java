package sample;

public class testMain {
  public static void main(String[] args) throws Exception {
    String action = null;
    String product_name = null;
    String regidate = null;
    String id = null;
    String address = null;
    int price = 0;

    for (int i = 0; i < args.length; ++i) {
        if ("-action".equals(args[i])) {
        action = args[++i];
      } else if ("-regidate".equals(args[i])) {
        regidate = args[++i];
      } else if ("-name".equals(args[i])) {
        product_name = args[++i];
      } else if ("-price".equals(args[i])) {
        price = Integer.parseInt(args[++i]);
      } else if ("-id".equals(args[i])){
        id = args[++i];
      } else if ("-address".equals(args[i])){
        address = args[++i];
      }else if ("-help".equals(args[i])) {
        printUsageAndExit();
      }
    }
    if (action == null) {
      printUsageAndExit();
    }

    test test = null;
    test = new testWithTransaction();
    

    if (action.equalsIgnoreCase("add1")) {
      test.add1(id,product_name, regidate,price,address);
    } else if (action.equalsIgnoreCase("add2")) {
        test.add2(id,product_name, regidate,price,address);
    } else if (action.equalsIgnoreCase("sold1")) {
      if (id == null) {
        printUsageAndExit();
      }
      test.sold1(id);
    } else if (action.equalsIgnoreCase("sold2")) {
        if (id == null) {
          printUsageAndExit();
        }
        test.sold2(id);
    } else if (action.equalsIgnoreCase("getinstance")){       
      if (id == null){
        printUsageAndExit();
        return;
      }
      test.getinstance(id);
      
    }
    test.close();
  }

  private static void printUsageAndExit() {
    System.err.println(
        "ElectronicMoneyMain -mode storage/transaction -action charge/pay -amount number -to id [-from id (needed for pay)]");
    System.exit(1);
  }
}
