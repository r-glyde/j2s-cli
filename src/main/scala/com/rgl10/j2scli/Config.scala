package com.rgl10.j2scli

import java.io.File

final case class Config(inputFile: File = new File("."), outputFile: Option[File] = None)
