# hello-world program using spark Scala
-> org.apache.spark.sql.SparkSession.HelloWorld object creates data frame and show out put on console.
-> No need to set any configuration to run spark code. Spark submit alone with class and jar is fine
-> Sample code to test spark scala with maven project

spark-submit --class org.apache.spark.sql.SparkSession.HelloWorld maven_target_jar_name.jar
