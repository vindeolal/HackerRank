package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object GradingStudents {

  def main(args: Array[String]) {
    val size = readInt()
    var inputs = Array[Int]()
    for (i <- 0 until size) {
      inputs = inputs :+ readInt()
    }
    for (i <- 0 until size) {
      if (inputs(i) > 37) {
        if ((inputs(i) + 1) % 5 == 0) inputs(i) = inputs(i) + 1
        else if ((inputs(i) + 2) % 5 == 0) inputs(i) = inputs(i) + 2
      }
    }
    println(inputs.mkString("\n"))
  }

}
