package part1

class Cup {
  var percentFull = 0
  val max = 100
  val min = 0
  
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