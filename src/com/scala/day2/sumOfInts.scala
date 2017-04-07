package com.scala.day2

/**
* Anonymous functions:
* (a:Int) => a*a*a
*/

/**
 * Higher Order function.
 * 1.	Takes function as argument or
 * 2. Returns a function as a result
 *
 * The type A => B is the type of the function that takes and argument of A and return B
 * So, Int => Int is the type of functions that map integers to integers.
 */


object MapReduce {

  def main(args: Array[String]): Unit = {

    mapReduce((x, y) => x + y)(x => x * x)(2, 7, 1)

    def sum = mapReduce((x, y) => x + y) _

    def product = mapReduce((x, y) => x * y) _

    def prodOfSquares = product(x => x * x)

    def sumOfSquares = sum(x => x * x)


    println(sumOfSquares(2, 7, 0))

    println(prodOfSquares(2, 7, 1))

    def add(x: Int, y: Int) = x + y

    def add1(y: Int) = add(1, y)

    println(add1(2))

  }


  def mapReduce(reduce: (BigInt, BigInt) => BigInt)(map: BigInt => BigInt)(x: BigInt, y: BigInt, identity: Int): BigInt = {

    @scala.annotation.tailrec
    def loop(x: BigInt, acc: BigInt): BigInt = {

      if (x > y) acc

      else loop(x + 1, reduce(acc, map(x)))

    }

    loop(x, identity)
  }

}

