package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object PlusMinus {

  def main(args: Array[String]) {
    val size = readInt
    val array = readLine.split(" ").take(size).map(_.toInt)
    val posArray = array.count(_ > 0)
    val negArray = array.count(_ < 0)
    val zeroArray = array.count(_ == 0)
    println(s"""${posArray.toDouble / size}""")
    println(s"""${negArray.toDouble / size}""")
    println(s"""${zeroArray.toDouble / size}""")
  }

}
