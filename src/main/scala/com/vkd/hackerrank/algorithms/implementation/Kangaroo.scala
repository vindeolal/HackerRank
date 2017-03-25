package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object Kangaroo {

  def main(args: Array[String]) {
    val inputs = readLine.split(" ").map(_.toInt)

    if ((inputs(1) > inputs(3)) && (inputs(0) - inputs(2)) % (inputs(3) - inputs(1)) == 0) println("YES") else println("NO")
  }

}
