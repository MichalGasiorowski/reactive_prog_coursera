package week1

// Partial function


/*
trait PartialFunction[-A, +R] extends Function1[-A, +R] {
	def apply(x: A): R
	def isDefinedAt(x: A): Boolean
}

*/


object session1_2 {

  //val f: String => String  = { case "ping" => "pong" }
  val f: PartialFunction[String, String]  = { case "ping" => "pong" }
                                                  //> f  : PartialFunction[String,String] = <function1>
  f("ping")                                       //> res0: String = pong
  //f("abc")
  
  f.isDefinedAt("ping")                           //> res1: Boolean = true
  
  
  val f2: PartialFunction[List[Int], String] = {
  	case Nil => "one"
  	case x :: y :: rest => "two"
  }                                               //> f2  : PartialFunction[List[Int],String] = <function1>
  
  f2.isDefinedAt(List(1, 2, 3))                   //> res2: Boolean = true
   
  val g: PartialFunction[List[Int], String] = {
  	case Nil => "one"
  	case x :: rest =>
  		rest match {
  			case Nil => "two"
  		}
  }                                               //> g  : PartialFunction[List[Int],String] = <function1>
  
  g.isDefinedAt(List(1, 2, 3))                    //> res3: Boolean = true
}