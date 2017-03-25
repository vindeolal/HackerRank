package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object SimpleArraySum {

  def main(args: Array[String]) {
    val size = readInt
    val array = readLine.split(" ").take(size).map(_.toInt).sum
    println(array)
  }

}
