package com.vkd.hackerrank.algorithms.implementation

/**
  * Created by Vind on 3/25/2017.
  */
object DrawingBook {

  def main(args: Array[String]) {
    val totalPages = readInt
    val page = readInt

    if (page == 1) println(0)

    else {
      val pagePairs = (2 to totalPages).sliding(2, 2).toArray
      val straightCount = pagePairs.zipWithIndex.filter(x => x._1.contains(page))(0)._2 + 1
      val reverseCount = pagePairs.reverse.zipWithIndex.filter(x => x._1.contains(page))(0)._2

      if (straightCount <= reverseCount) println(straightCount) else println(reverseCount)
    }
  }

}
