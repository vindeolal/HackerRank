package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object BonAppétit {

  def main(args: Array[String]) {
    val nk = readLine().split(" ").map(_.toInt)
    val nInput = readLine().split(" ").map(_.toInt)
    val bcharged = readInt

    nInput.update(nk(1), 0)
    val actual = nInput.sum / 2
    if (actual == bcharged)
      println("Bon Appetit")
    else println(bcharged - actual)
  }

}
