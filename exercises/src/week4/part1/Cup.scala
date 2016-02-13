package week4.part1

class Cup {
  var percentFull = 0
  val max = 100
  val min = 0
  
  def set(percentFull:Int):Unit = {
    this.percentFull = percentFull
  }
  
  def get():Int = {
    percentFull
  }
  
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if (percentFull < min) {
      percentFull = min
    }
    percentFull // Return this value
  }  
}