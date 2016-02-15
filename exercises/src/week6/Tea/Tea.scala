package week6.Tea

class Tea(name : String = "Earl Grey", decaf : Boolean = false, milk : Boolean = false, sugar : Boolean = false) {
  def describe() : String = {
    var answer = name
    if (decaf) answer+= " decaf"
    if (milk) answer+= " + milk"
    if (sugar) answer+= " + sugar"
    return answer
  }
  def calories() : Int = {
    var answer = 0
    if (milk) answer+= 100
    if (sugar) answer+= 16
    return answer
  }
}