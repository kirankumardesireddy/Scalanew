

object functioncomposition extends App {
  
  
  var result = multiplyby2(add2(10))
  println(result)
  
  def add2(a:Int):Int = {
    a+2
  }
  
  def multiplyby2(a:Int):Int = {
    
    a*2
  }
  
  
}