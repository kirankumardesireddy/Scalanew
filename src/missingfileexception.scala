


//import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import scala.io.Source

object missingfileexception {
   def main(args: Array[String]) {
      try {
       //  val f = new FileReader("/Users/kirand/Documents/Movies.txt")
        val f =   Source.fromFile("/Users/kirand/Documents/Movies3.txt")
        
        //for (line <- f.getLines()) {println(line)}
             
        
      } catch {
         case ex: FileNotFoundException => { println("Missing file exception") }  
         case ex: IOException           => {println("IO Exception") }     
         case ex: Exception => {println("Exception") } 
      }     
        finally{
           println("Exiting finally..")
         }
   }
}


