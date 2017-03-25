package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object BetweenTwoSets {

  def main(args: Array[String]) {
    val inputs = readLine().split(" ").map(_.toInt)
    val setA = readLine().split(" ").map(_.toInt).toSet
    val setB = readLine().split(" ").map(_.toInt).toSet

    val lastA = setA.last
    val firstB = setB.head
    var count = 0
    for (i <- lastA to firstB) {
      val sizeA = setA.count(x => i % x == 0)
      val sizeB = setB.count(x => x % i == 0)
      if (sizeA == inputs(0) && sizeB == inputs(1))
        count += 1
    }
    println(count)
  }

}
