package week6.args

class Item (name : String, price : Double) {
  def cost (grocery : Boolean = false, medication : Boolean = false, rate : Double = 0.10) : Double = {
    if (grocery || medication) {
      return price
    } else return price + price * rate
  }
}