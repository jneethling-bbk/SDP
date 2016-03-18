package week7.map_reduce

import week4.atomicscala.AtomicTest._

object Q1 extends App {
  
  // using map
  val v = Vector(1, 2, 3, 4)
  v.map(n => n * 11 + 10) is Vector(21, 32, 43, 54)

  // using for
  var buf = scala.collection.mutable.ArrayBuffer.empty[Int] 
  var e = 0
  for (element <- v) {
    e = element * 11 + 10
    buf += e
  }
  buf.toVector is Vector(21, 32, 43, 54)
}