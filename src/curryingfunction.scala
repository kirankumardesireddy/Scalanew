

object curryingfunction extends  App {
  
  def add(a:Int)(b:Int) = {
    
    a+b
    
  }
  
  
 var result = add(10)(10)
 println("10+10 =" +result)
 
 var addIt = add(10)_
 
 var result2 = addIt(3)
 println("10 +3 =" +result2) 
  
}