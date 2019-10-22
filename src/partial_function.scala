

object partial_function extends App {
  
  val pfa = (x:String, y:String) => x+y;
  
  val email = pfa(_:String, "@emailedu.com")
  
  println(email("ravi"))

  
  
}