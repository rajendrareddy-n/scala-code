package com.scala.day3

// Classes
import scala.beans.BeanProperty

class Employee(@BeanProperty val empId:Int, @BeanProperty var fname:String, lName:String)


