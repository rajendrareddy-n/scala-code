package com.scala.day1


/**
* Functional programming, Scala
* Day1:
*	
*	1. Introduction to functional programming.
*	2. Introduction to Scala.
*	3. FP Concept: 
*		Pure Functions: Pure functions are referentially transparent.
*			A function is a pure function if relies on only pramaters passed to that.
*			with zero side effect
*	4. Advantages of pure functions
		a. Easy to test and debug
		b. Bug free code
		c. Memoization(Caching)
		d. Thread safe code. 									
*	5. Imperative vs functional programming
	6. Solving imperative problems using recursion.
	7. Solving Stack overflow problem in recursion with Tail recursion.
*
*/
object Basic{
var x = 30;

// This method has side efect: Access global variable x
def add( y: Int) = x + y

def main(args: Array[String]): Unit = {

  println(add(2))

  x = 50
  println(add(2)) /// The return value is not same as above even as the same parameter value.

  println(factorial(5000))
  //println(factorialWithTailRec(10000, 1))
}

// Factorial with out tail recursion: Gives Stack overflow error for bigger numbers.
def factorial(n:BigInt):BigInt = if (n ==1 || n ==0 ) 1 else n * factorial(n-1)


// Factorial with tail recursion: Reuses the same stack frame to eliminate stackoverflow error.
@scala.annotation.tailrec
def factorialWithTailRec(n:BigInt, acc:BigInt):BigInt = if (n == 1 || n == 0) acc else factorialWithTailRec(n-1, acc*n)

}


