Java Spring Assignment 

this is a Java Spring and Hibernate Assignment that Supposed to Simulate the Cart system of Disney Shop 
https://www.shopdisney.co.uk/disney-store-disney-princess-costume-collection-for-kids-2841047080168M.html

what Java Contain
Data Access Layer: by implementing Jpa Repository 
data Transfer Object: that Transfer the JSON Object or body into Jpa
Rest Controller: for Post Mapping 
Service Layer: for Transaction and Call the DAO Methods
Configuration File: to Disable the HTTP Methods for product and Category Class

what DataBase Scripts contain :
01: SQL script for creating a new user (used by properties) 
02: structure of schema and table 
03: pre-defined values to fill products and category with sample data 


what JSON File has :
example of Json Body That Post feed the order entity and order item entity

how to set up the project 
FIRST : 
open the "DB_Scribt" file STEB BY STEB
first step -> create User 
second step -> create schema and tables 
the third step -> fill the database with sample data 
 
 SECOND : (JAVA 11 IS REQUIRED)
 open demo.example java project using any ide or code editor 
 update Maven if required 
 in the "demo.example\src\main\java\cart\demo\example" RUN "Application.java"
 
 EndPoints:
 for products and category 
 http://localhost:8080/api
 http://localhost:8080/api/products 
 http://localhost:8080/api/categories
 
 for find products by name 
 http://localhost:8080/api/products/search/findByNameContaining?name=
 http://localhost:8080/api/products/search/findByNameContaining?name=Raya
 http://localhost:8080/api/products/search/findByNameContaining?name=Rapunzel
 
 
 CONSIDERING THE JSON BODY IS THE CART 
 Third : USE HTTP METHODS (POSTMAN)
 POST : http://localhost:8080/api/purchase/add
 BODY : 
 {
    "orderItem": [
        {
            "quantity":5,
            "productId": 1,
            "size": 3
        },
        {
            "quantity": 3,
            "productId": 2,
            "size": 2
        }
    ]
}

          DB CHANGES 	to OrderItem    
          
id    Quantity    order_id    product_id    size_id
1	      5	          1	        2	            4
2	      3	          1	        2	            2

                                                                DB CHANGES 	to Order 
                                                                
id          order_tracking_number               total_price         total_quantity          date_created                last_updated
1     	82871b47-f427-4bc2-bbf3-0b87fabe3b9d	    247.60	              8	          2021-06-17 00:29:47.852000	     2021-06-17 00:29:47.852000
