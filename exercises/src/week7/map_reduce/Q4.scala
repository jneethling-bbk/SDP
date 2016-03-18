package week7.map_reduce

import week4.atomicscala.AtomicTest._

object Q4 extends App {
  
  def sumIt(elements : Int*) : Int = {
    return elements.reduce((sum, n) => sum + n)
  }

  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195
}