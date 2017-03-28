package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object CatsandaMouse {

  def main(args: Array[String]): Unit = {
    val queries = readInt
    var xyz = Array[String]()
    (1 to queries).foreach { x =>
      xyz = xyz :+ readLine
    }
    xyz.foreach(x => checkPos(x))
  }

  def checkPos(pos: String): Unit = {
    val xyz = pos.split(" ").map(_.toInt)

    val xToz = Math.abs(xyz(0) - xyz(2))
    val yToz = Math.abs(xyz(1) - xyz(2))

    if (xToz < yToz) println("Cat A")
    else if (yToz < xToz) println("Cat B")
    else
      println("Mouse C")
  }
}

