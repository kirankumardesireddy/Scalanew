

object highorder_function extends App {
  
  def functionExample(a:Int, f:Int => AnyVal):Unit = {
    
    println(f(a))
  }
  
  def multiplyby2(a:Int):Int = {
    
    a * 2
  }
  
  functionExample(25,multiplyby2) //passing function as parameter
}