
start server :

```
   1、 start redis server
        you can remove the password in application.properties

        spring.redis.password=aWRhcmsxMjEwMTc=

   2、 start application
```

Scene reduction :

```
    1、 POST request ->  localhost:8081/login
        param :
        {
        	"code":"test",
        	"pwd":"test"
        }

    2、 POST/GET  request ->  localhost:8081/logout
        Two cases：
            a、use spring-boot-devtools
            b、don`t use
        Configure here ： pom.xml:28
```
