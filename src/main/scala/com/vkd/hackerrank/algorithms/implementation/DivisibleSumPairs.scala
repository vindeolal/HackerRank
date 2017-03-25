package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vinod on 3/25/2017.
  */
object DivisibleSumPairs {

  def main(args: Array[String]) {
    val nk = readLine.split(" ").map(_.toInt)
    val n = readLine.split(" ").map(_.toInt)
    val k = nk(1)
    var count = 0
    for (i <- 0 until nk(0) - 1) {
      for (j <- i + 1 until nk(0)) {
        if ((n(i) + n(j)) % k == 0) {
          count += 1
        }
      }
    }
    print(count)
  }

}
