package hello.scala

import org.apache.spark.sql.SparkSession

object HelloWorld {
   def main(args: Array[String]): Unit = {
     val spark = SparkSession.builder()
			                        .appName("HelloWorld")
			                        .master("local")
			                        .getOrCreate()
		 import spark.implicits._
		 val df = Seq(("ganesh","25"),("suresh","30"),("mahesh","35")).toDF("name","age")
		 println("Wellcome to Hello World program with sample data bellow:"+ df.show())
   }
}