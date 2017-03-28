package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/26/2017.
  */
object DesignerPDFViewer {

  def main(args: Array[String]): Unit = {

    val ratings = readLine.split(" ").map(_.toInt)
    val word = readLine.toCharArray.map(x => x.toInt - 'a'.toInt)

    val height = word.map(x => ratings(x)).sorted.last
    println(word.length * height)

  }

}
