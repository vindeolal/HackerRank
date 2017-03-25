package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object AVeryBigSum {

  def main(args: Array[String]) {
    val size = readInt
    val arraySum = readLine.split(" ").take(size).map(_.toLong).sum
    println(arraySum)
  }

}
