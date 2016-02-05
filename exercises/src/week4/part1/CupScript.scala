package part1

import week4.atomicscala.AtomicTest._

object CupScript {
  def main(args: Array[String]) {
	  val cup = new Cup
	  cup.add(45) is 45
	  cup.add(-15) is 30
	  cup.add(-50) is 0
    cup.add(45) is 45
    cup.add(-55) is 0
    cup.add(10) is 10
    cup.add(-9) is 1
    cup.add(-2) is 0
	  
    cup.percentFull = 56
    cup.percentFull is 56
  
    cup.set(56)
    cup.get() is 56

  }
}