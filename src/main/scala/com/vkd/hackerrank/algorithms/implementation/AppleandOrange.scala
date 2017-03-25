package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object AppleandOrange {

  def main(args: Array[String]) {
    val homeDis = readLine.split(" ").map(_.toInt)
    val treePoints = readLine.split(" ").map(_.toInt)
    val appleOrangeNum = readLine.split(" ").map(_.toInt)
    val applePoints = readLine.split(" ").map(_.toInt)
    val orangePoints = readLine.split(" ").map(_.toInt)

    val homeDisPoints = (homeDis(0) to homeDis(1)).toList
    var appleCount = 0
    var orangeCount = 0
    applePoints.foreach { x =>
      val dis = treePoints(0) + x
      if (dis >= homeDis(0) && dis <= homeDis(1))
        appleCount += 1
    }
    orangePoints.foreach { x =>
      val dis = treePoints(1) + x
      if (dis >= homeDis(0) && dis <= homeDis(1))
        orangeCount += 1
    }

    println(s"""$appleCount""")
    println(s"""$orangeCount""")

  }

}
