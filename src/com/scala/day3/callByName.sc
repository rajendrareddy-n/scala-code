object callByName {
	
	def add(x:Int, y: => Int):Unit ={
		println(x + y)
		println(x + y)
		println(x + y)
	}
	
	
	def some(y:Int):Int ={
		println("In some method")
		y +1
	}
	
	add(2, some(3))

}