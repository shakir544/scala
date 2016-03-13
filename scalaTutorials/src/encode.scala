

class encode {
 // Clousers In Scala 
  def decodeWithSeeds(num :Int, seed:Long) : Long = { 
    
     // Higher order 
    def decode(num:Int, func: (Int) =>Long) : Long = { 
      val newNum = num + 100
      func(newNum) 
    }
    
    val code = decode(100, (num :Int) => (num *seed) )
    code
    
  }
}
object TestEncode { 
  def main(args : Array[String]) { 
    val obj = new encode()
    
     println(obj.decodeWithSeeds(100, 10))
    
  }
}


  