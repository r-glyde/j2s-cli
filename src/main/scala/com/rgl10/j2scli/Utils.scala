package com.rgl10.j2scli

import java.io.{BufferedWriter, File, FileWriter}

import com.typesafe.scalalogging.LazyLogging

import scala.io.Source

object Utils extends LazyLogging {
  def inputToString(input: File): String = {
    val bs = Source.fromFile(input)
    bs.getLines().mkString("\n")
  }

  def outputToFile(output: String, file: File): Unit = {
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(output)
    logger.info(s"$file written")
    bw.close()
  }
}
