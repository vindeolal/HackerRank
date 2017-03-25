package com.vkd.hackerrank.algorithms.warmup

/**
  * Created by Vind on 3/25/2017.
  */
object TimeConversion {

  def main(args: Array[String]) {
    val twelHrs = readLine().split(":")
    val amPm = twelHrs(2).toCharArray.drop(2).mkString
    if (amPm.equalsIgnoreCase("PM") || (amPm.equalsIgnoreCase("AM") && twelHrs(0).equals("12"))) {
      if (!twelHrs(0).equals("12"))
        twelHrs(0) = (12 + twelHrs(0).toInt).toString
      else if (!amPm.equalsIgnoreCase("PM"))
        twelHrs(0) = "00"
    }
    println(s"""${twelHrs.take(2) mkString ":"}:${twelHrs(2).toCharArray.take(2).mkString("")}""")
  }

}
