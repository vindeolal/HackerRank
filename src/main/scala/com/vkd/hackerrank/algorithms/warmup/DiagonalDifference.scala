package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object DiagonalDifference {

  def main(args: Array[String]) {
    val lines = readInt()
    var array = Array[Array[Int]]()
    for (i <- 0 until lines) {
      array = array :+ readLine().split(" ").map(_.toInt)
    }
    var diag1 = 0
    var diag2 = 0
    for (i <- 0 until lines) {
      diag1 += array(i)(i)
      diag2 += array(i)((lines-1) - i)
    }
    println(Math.abs(diag1 - diag2))
  }

}
