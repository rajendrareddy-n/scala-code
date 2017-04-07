package com.scala.day4

import scala.beans.BeanProperty
class Person(val x:Int, @BeanProperty val y:Int){

	//def this(x:Int) = {this(x, 20); println(x + y)}

	override def toString():String ={
		s"x: ${this.x} y: ${this.y}"
	}

	/*override def hashcode():Int ={
		???
	}

	override def equals(Any:x): Boolean ={
		???
	}*/

	def copy(x:Int = this.x, y:Int = this.y) ={
			new Person(x,y)
	}

}

/**
	* When you declare a case class the Scala compiler does the following for you.
	*
	* 1. Creates a class and its companion object.
	* 2. Implements the apply() method that you can use as a factory. This lets you crate instances of a class with out new.
	* 3. Class is immutable, hence you can get the accessors but not mutators.
	* 4. Adds natural implementations of hashCode(), toString() and equals(). Scala == delegates to equals.
	* 5. Generates a copy() method to you class to create other instances starting from another one and keeping some arguments same.
	* 6. Each case class extends the Product trait it inherits the following methods
	* 		a. def productArity: Int, returns the size of this product. In this case it corresponds to the number of arguments in the case class.
	* 		b  def productElement(n: Int): Any, returns the n-th element of this product, 0-based. In this case it corresponds to the n-th argument of the class
	* 		c. def productIterator: Iterator[Any], returns an iterator over all the elements of this product which, in the case class context, they are its arguments
	* 		d. def productPrefix: String, returns a string used in the toString method of the derived classes. In this case it’s the name of the class
	*
	* The curried and tupled methods are inherited from AbstractFunctionN which is extended by the auto generated companion object. N is the number of the case class formal parameters.
	* Note that, of course, if N = 1 you won’t get curried and tupled because they wouldn’t make sense for just one parameter!
	*
	*/
//case class Person(x:Int, y:Int)

abstract class Employee{
	def x(x1:Int):Int
	def y:Int	
}

object MyObject{

	def main(args: Array[String]): Unit = {
		val person1 = new Person(2, 3)

		println("Hello World")

		println(person1.toString())

		val person2 = person1.copy(y = 10)
		println(person2.toString())
		//person1.y =
	}
	
}

