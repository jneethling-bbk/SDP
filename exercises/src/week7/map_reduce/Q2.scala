package week7.map_reduce

import week4.atomicscala.AtomicTest._

object Q2 extends App {
  
  // using map
  val v = Vector(1, 2, 3, 4)
  v.map(n => n + 1) is Vector(2, 3, 4, 5)
  
  //using for
  var buf = scala.collection.mutable.ArrayBuffer.empty[Int] 
  var e = 0
  for (element <- v) {
    e = element + 1
    buf += e
  }
  buf.toVector is Vector(2, 3, 4, 5)

}