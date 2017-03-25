package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object MigratoryBirds {

  def main(args: Array[String]) {
    val size = readInt
    val input = readLine.split(" ")

    val out = input.groupBy(x => x.toInt).map(x => (x._1, x._2.length)).toList.map(x => (x._2, x._1)).sorted

    val largestLen = out.last._1
    val id = out.filter(x => x._1 == largestLen).head._2

    println(id)
  }

}
