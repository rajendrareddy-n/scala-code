package com.scala.day3

/**
  * A closure is a function that has access to the variable in its parent function,
  * even after its parent function is finished being executed.
  *
  */
object ClosureExample{

  def makeIncreament(start: Int): Int => Int = {
    var count = start;
    def increment(x: Int): Int = {
      count += x;
      count
    }
    increment
  }

  def main(args: Array[String]): Unit = {
    var incrementA = makeIncreament(0);
    println(incrementA(1))
    println(incrementA(100))
    println(incrementA(1))
    var incrementB = makeIncreament(10);
    println(incrementB(1))
    println(incrementA(1))
    println(incrementB(1))
    println(incrementA(1))
  }

}
