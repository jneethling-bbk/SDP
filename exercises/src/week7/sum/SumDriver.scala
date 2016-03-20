package week7.sum

object SumDriver extends App {
  
  Left[Int, String](1).value
  Right[Int, String]("foo").value
  val sum: Sum[Int, String] = Right("foo")
  sum match {
   case Left(x) => x.toString
   case Right(x) => x
 }
}