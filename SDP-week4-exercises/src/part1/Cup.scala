package part1

import part1.atomicScala.AtomicTest._

class Cup {
  var percentFull = 0
  val max = 100
  
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    percentFull // Return this value
  }  
}