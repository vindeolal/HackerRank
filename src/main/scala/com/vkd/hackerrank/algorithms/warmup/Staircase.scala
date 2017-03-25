package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object Staircase {

  def main(args: Array[String]) {
    val size = readInt()
    for (i <- 1 to size) {
      for (j <- 1 to size - i) {
        print(" ")
      }
      for (j <- 1 to i) {
        print("#")
      }
      println("")
    }
  }

}
