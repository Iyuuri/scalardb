# final report Scalar DB
This is final report for Advanced Course in Database System.

We make a product management system across multiple sites.

We assume the case that seller want to place the same product on different sites to sell efficiently.
In that case, if separate users tyr to buy the product simultaneously, ERROR(which user can buy?) will happen.

In this management system, if the product is sold in one site, the other sites make the product stop selling.

Data schema like this

|id|product name|registration date|is_sold|price|address|
|---|---|---|---|---|---|
|TEXT|TEXT|TEXT|INT|INT|TEXT|

We use cassadra as database system and two table.
The json file like this

```
{
    "test1.item":{
        "transaction": true,
        "partition-key":[
            "id"
        ],
        "clustering-key":[],
        "columns":{
            "id": "TEXT",
            "product_name": "TEXT",
            "registration_date": "TEXT",
            "is_sold": "INT",
            "price": "INT",
            "address": "TEXT"
        }
    },
    "test2.item":{
        "transaction": true,
        "partition-key":[
            "id"
        ],
        "clustering-key":[],
        "columns":{
            "id": "TEXT",
            "product_name": "TEXT",
            "registration_date": "TEXT",
            "is_sold": "INT",
            "price": "INT",
            "address": "TEXT"
        }
    }
}
```

The identify of is_sold is the value of 0 or 1, whhich shows the product is sold or not (0:selling, 1: sold).

We make 5 functions add(1,2), sold(1,2), and get_instance.

The function of add can add the product data into the detabase of each site.

The function of sold can rewrite the identify of is_sold from 0 to 1.　And this function is transaction action, so check another table's is_sold to valid the product selling.

The function of get_instance can check the product data. So we can know where the product is sold and the status od product.

We show the example of using below.
First to apply the schema, run the following command to load the schema.
```
$ java -jar scalardb-schema-loader-3.5.2.jar --config scalardb.properties -f test.json
```

Now we can run the application.
```
$ ../../gradlew run --args="-action add1 -regidate 20200701 -name Macbook -price 200000 -id 01 -address america"
$ ../../gradlew run --args="-action sold1 -id 01"
$ ../../gradlew run --args="-action get_instance -id 01"
```

When the function of sold1 and sold2 are executed simultaneously, the product is sold by one site, and in the other site the product cannot be sold.