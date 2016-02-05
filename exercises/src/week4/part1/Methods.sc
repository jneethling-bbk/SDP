package part1

object Methods {
	
	def getSquare(num1 : Int) : Int = {
  	num1 * num1
  }                                               //> getSquare: (num1: Int)Int
  
  val a = getSquare(3)                            //> a  : Int = 9
  assert(a == 9)
  val b = getSquare(6)                            //> b  : Int = 36
  assert(b == 36)
  
  def isArg1GreaterThanArg2(num1: Double, num2: Double) : Boolean = {
  num1 > num2
  }                                               //> isArg1GreaterThanArg2: (num1: Double, num2: Double)Boolean
  
  println(isArg1GreaterThanArg2(4.2, 4.1))        //> true
  
  val t1 = isArg1GreaterThanArg2(4.1, 4.12)       //> t1  : Boolean = false
	assert(!t1)
	val t2 = isArg1GreaterThanArg2(2.1, 1.2)  //> t2  : Boolean = true
	assert(t2);
  
  def manyTimesString(s: String, num: Int) : String = {
  	s * 3
  }                                               //> manyTimesString: (s: String, num: Int)String
  
  println(manyTimesString("abc", 3))              //> abcabcabc
  
  val m1 = manyTimesString("abc", 3)              //> m1  : String = abcabcabc
	assert("abcabcabc" == m1, "Correct")
	val m2 = manyTimesString("123", 2)        //> m2  : String = 123123123
	assert("123123" == m2, "Incorrect")       //> java.lang.AssertionError: assertion failed: Incorrect
                                                  //| 	at scala.Predef$.assert(Predef.scala:165)
                                                  //| 	at part1.Methods$$anonfun$main$1.apply$mcV$sp(part1.Methods.scala:34)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at part1.Methods$.main(part1.Methods.scala:3)
                                                  //| 	at part1.Methods.main(part1.Methods.scala)
}