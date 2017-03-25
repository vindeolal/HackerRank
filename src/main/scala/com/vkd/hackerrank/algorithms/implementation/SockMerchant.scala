package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object SockMerchant {

  def main(args: Array[String]) {
    val number = readInt
    val socks = readLine.split(" ").take(number).map(_.toInt)

    val pairCount = socks.groupBy(x => x).toArray.map(x => x._2.length / 2).sum

    println(pairCount)
  }

}
