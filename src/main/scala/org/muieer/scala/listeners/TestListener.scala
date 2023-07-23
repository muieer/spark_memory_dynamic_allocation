package org.muieer.scala.listeners

import org.apache.spark.scheduler.{SparkListener, SparkListenerApplicationEnd, SparkListenerApplicationStart}

class TestListener extends SparkListener {

  override def onApplicationStart(applicationStart: SparkListenerApplicationStart): Unit = {
    println(s"@muieer,${applicationStart.appName}")
  }

  override def onApplicationEnd(applicationEnd: SparkListenerApplicationEnd): Unit = {
    super.onApplicationEnd(applicationEnd)
  }

}
