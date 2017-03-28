package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/28/2017.
  */
object UtopianTree {

  def main(args: Array[String]) {
    val tesCase = readInt
    import scala.collection.mutable.ListBuffer
    val list = ListBuffer[Int]()
    (1 to tesCase).foreach { x =>
      list += readInt
    }
    val updatedList = ListBuffer[Int]()
    list.foreach { x =>
      if (x % 2 == 0) updatedList += (Math.pow(2, x / 2 + 1) - 1).toInt else updatedList += (Math.pow(2, x / 2 + 2) - 2).toInt
    }
    println(updatedList.mkString("\n"))
  }

}
