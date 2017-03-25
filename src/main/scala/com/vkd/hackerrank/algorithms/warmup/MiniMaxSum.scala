package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object MiniMaxSum {

  def main(args: Array[String]) {
    val input = readLine().split(" ").map(_.toLong)
    val sortedInput = input.sorted
    val minSum: Long = sortedInput.take(4).sum
    val maxSum: Long = sortedInput.drop(1).sum
    println(s"""$minSum $maxSum""")
  }

}
