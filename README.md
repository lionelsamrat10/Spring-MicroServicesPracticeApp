# Spring-MicroServicesPracticeApp
Created a very basic app to perform interaction between microservices.

## Here we have three microservices:

<div>
  
1. ProductSevice microservice (Will run on Port-5100)
<img src="https://github.com/lionelsamrat10/Spring-MicroServicesPracticeApp/blob/main/Screenshots/productservice.png">
<br/>
2. CouponSevice microservice (Will run on Port-5200)
<img src="https://github.com/lionelsamrat10/Spring-MicroServicesPracticeApp/blob/main/Screenshots/couponservice.png">
<br/>
3. OrderSevice microservice (Will run on Port-5000)
<img src="https://github.com/lionelsamrat10/Spring-MicroServicesPracticeApp/blob/main/Screenshots/orderservice.png">
<br/>
4. The Eureka Client (Will run on Port-8761)
<img src="https://github.com/lionelsamrat10/Spring-MicroServicesPracticeApp/blob/main/Screenshots/eureka_server.png">
</div>

<p>
   ** The ProductService and CouponService Microservices are being used by the OrderService Microservice and this connection is done via RestTemplate and Eureka Client By Netflix.
</p>
