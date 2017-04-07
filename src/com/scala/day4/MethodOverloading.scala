package com.scala.day4

object MethodOverloadingTest extends App {
  def addNum(x: Int) = x + 1

  def addNum2(y: Double) = y + 2.0

  def addNum3(x: String) = x + 3

  println(addNum(2))
  println(addNum2(20.0))
  println(addNum3("Hello"))
}

