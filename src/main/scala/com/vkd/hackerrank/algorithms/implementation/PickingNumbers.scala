package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object PickingNumbers {

  def main(args: Array[String]): Unit = {

    val size = readInt
    val array = readLine.split(" ").take(size).map(_.toInt)

    val grup = array.groupBy(x => x).toArray.map(x => (x._1, x._2.length)).sorted
    for (i <- grup.indices) {
      if (i + 1 < grup.length && grup(i + 1)._1 - grup(i)._1 <= 1) {
        val value = grup(i)._1
        val count = grup(i)._2 + grup(i + 1)._2
        grup.update(i, (value, count))
      }
    }
    println(grup.map(x => x._2).sorted.last)
  }

}
