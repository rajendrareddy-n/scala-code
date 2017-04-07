object Closure {
	
	
	def outer(x:Int) ={
		var y = x
		def inner = {
			y += x  //y= y+x
			y
		}
		
		def inner1 = {
			y += x  //y= y+x
			y
		}
		
		inner _
	}
	
	
	val z = outer(1)
	
	z()
	z()
	z()
	
	val z1 = outer(1)
	z1()
	z()
	
}