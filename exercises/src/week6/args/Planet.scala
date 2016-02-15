package week6.args

class Planet (name : String, description : String, moons : Int = 1) {
  def hasMoon() : Boolean = {
    if (moons == 0) {
      return false
    } else return true
  }
}