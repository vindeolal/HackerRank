package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/26/2017.
  */
object TheHurdleRace {

  def main(args: Array[String]): Unit = {

    val nk = readLine.split(" ").map(_.toInt)
    val heights = readLine.split(" ").map(_.toInt)
    val maxHeight = nk(1)
    val cantJump = heights.filter(x => x > maxHeight)
    if (cantJump.nonEmpty) {
      println(cantJump.sorted.last - maxHeight)
    } else
      println(0)
  }

}
