package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object BreakingtheRecords {

  def main(args: Array[String]) {
    val games = readInt()
    val scores = readLine().split(" ").map(_.toInt).toList

    var miCount = 0
    var maCount = 0
    var min = scores.head
    var max = scores.head
    for (i <- 1 until games) {
      if (scores(i) > max) {
        max = scores(i)
        maCount += 1
      }
      if (scores(i) < min) {
        min = scores(i)
        miCount += 1
      }
    }
    println(s"""$maCount $miCount""")
  }

}
