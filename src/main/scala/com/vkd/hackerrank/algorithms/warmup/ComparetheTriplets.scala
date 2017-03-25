package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object ComparetheTriplets {

  def main(args: Array[String]) {
    val aTriplet = readLine.split(" ").map(_.toInt)
    val bTriplet = readLine.split(" ").map(_.toInt)

    var aPoints = 0
    var bPoints = 0

    for (i <- 0 until 3) {
      if (aTriplet(i) - bTriplet(i) > 0) aPoints += 1 else if (aTriplet(i) - bTriplet(i) != 0) bPoints += 1
    }
    println(s"""$aPoints $bPoints""")
  }

}
