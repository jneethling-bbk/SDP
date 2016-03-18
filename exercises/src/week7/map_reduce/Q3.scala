package week7.map_reduce

import week4.atomicscala.AtomicTest._

object Q3 extends App {
  
  // using reduce
  val v = Vector(1, 10, 100, 1000)
  v.reduce((sum, n) => sum + n) is 1111
  
  //using for
  var e = 0
  for (element <- v) {
    e = e + element
  }
  e is 1111
}