

class Add {
  
  def add(x:Int, y:Int):Int = { 
    val sum = x + y
    return sum
  }
}

object testAdd { 
  
  val value = new Add()
  
  def main(args : Array[String]) { 
    println(value.add(10,30))
  }
}