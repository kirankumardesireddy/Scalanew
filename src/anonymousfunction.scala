

object anonymousfunction extends   App{
  
  
  var result1 = (a:Int, b:Int) => a+b
  
  var result2 =(_:Int) +  (_:Int)
  
  println(result1(10,10))
  
    println(result2(10,10))
  
}