package week4.part1

class Sailboat {
  def raise() : String = {
    return "Sails raised"
  }
  def lower() : String = {
    return "Sails lowered"
  }
  def signal() : String = {
    val flare = new Flare
    return flare.light()
  }
}