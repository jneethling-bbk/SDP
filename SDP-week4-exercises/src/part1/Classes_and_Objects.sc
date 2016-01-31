package part1

object Classes_and_Objects {
  val r1 = 1 to 10                                //> r1  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7,
                                                  //|  8, 9, 10)
  println(r1.step)                                //> 1
  
  val r2 = 1 to 10 by 2                           //> r2  : scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
  println(r2.step)                                //> 2
  
  var s1 = "Sally"                                //> s1  : String = Sally
  var s2 = "Sally"                                //> s2  : String = Sally
  
  if (s1.equals(s2)) {
  	println("s1 and s2 are equal")
  } else {
  	println("s1 and s2 are not equal")
  }                                               //> s1 and s2 are equal
}