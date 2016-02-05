package part1

class Motorboat {
  def on() : String = {
    return "Motor on"
  }
  def off() : String = {
    return "Motor off"
  }
  def signal() : String = {
    val flare = new Flare
    return flare.light()
  }
}