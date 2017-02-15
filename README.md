# cprop-order

Test load-config order

## Usage

```
lein uberjar

# 1
java -cp target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./ cprop_order.core
classpath:  target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./
read config from resource: "config.edn"
value:  jar

# 2
java -cp ./:./conf:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./ cprop_order.core
classpath:  ./:./conf:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./
read config from resource: "config.edn"
value:  root

# 3
java -cp ./conf:./:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./ cprop_order.core
classpath:  ./conf:./:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./
read config from resource: "config.edn"
value:  conf

# 4
java -Dvalue=java -cp ./conf:./:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./ cprop_order.core
classpath:  ./conf:./:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./
read config from resource: "config.edn"
value:  java

# 5
VALUE=env java -Dvalue=java -cp ./:./conf:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./ cprop_order.core
classpath:  ./:./conf:target/cprop-order-0.1.0-SNAPSHOT-standalone.jar:./
read config from resource: "config.edn"
value:  env
```
