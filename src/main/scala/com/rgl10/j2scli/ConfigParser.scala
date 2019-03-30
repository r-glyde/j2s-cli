package com.rgl10.j2scli

import java.io.File

import scopt.OParser

object ConfigParser {
  val builder = OParser.builder[Config]
  val parser = {
    import builder._
    OParser.sequence(
      programName("j2s-cli"),
      opt[File]('i', "input")
        .valueName("<file>")
        .required()
        .text("input file")
        .action((f, c) => c.copy(inputFile = f))
        .validate(file => if (file.exists()) success else failure(s"$file does not exist.")),
      opt[File]('o', "output")
        .valueName("<file>")
        .text("optional output file - do not set to use stdout")
        .action((f, c) => c.copy(outputFile = Some(f)))
    )
  }
}
