

object callbyname extends App{
  
  def rollnum(i: =>Int) {
    
    println( "Ravi deposited day1 $1 -Balance = " +i)
    println( "Ravi deposited day1 $1 -Balance = " +i)
    println( "Ravi deposited day1 $1 -Balance = " +i)
    println( "Ravi deposited day1 $1 -Balance = " +i)      
        
  }
  
  var amount =0
  
  rollnum{ amount +=1 ; amount}
}