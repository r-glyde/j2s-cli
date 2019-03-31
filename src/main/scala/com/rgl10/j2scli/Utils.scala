package com.rgl10.j2scli

import java.io.{BufferedWriter, File, FileWriter}

import scala.io.Source

object Utils {
  def inputToString(input: File): String = {
    val bs = Source.fromFile(input)
    bs.getLines().mkString("\n")
  }

  def outputToFile(output: String, file: File): Unit = {
    val bw = new BufferedWriter(new FileWriter(file))
    bw.write(output)
    bw.close()
  }
}
