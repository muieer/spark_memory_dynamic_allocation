package org.muieer.scala

import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object Main {

  def main(args: Array[String]): Unit = {

    val sparkConfig = new SparkConf().set("spark.extraListeners", "org.muieer.scala.listeners.TestListener")

    val spark = SparkSession
      .builder()
      .master("local[4]")
      .appName("spark_memory_dynamic_allocation")
      .config(sparkConfig)
      .getOrCreate()
    val sc = spark.sparkContext

    val count = sc.textFile(args(0)).count()

    Thread.sleep(100000)
    println(count)

  }
}
