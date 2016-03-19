package week7.Traits

trait Colour {
  def name: String
  def redVal: Int
  def greenVal: Int
  def blueVal: Int
  def description: String =
    if (redVal + greenVal + blueVal > 380) "Light" else "Dark" 
}

case class Red() extends Colour {
  val name = "Red"
  val redVal = 255
  val greenVal = 0
  val blueVal = 0
}

case class Yellow() extends Colour {
  val name = "Yellow"
  val redVal = 255
  val greenVal = 255
  val blueVal = 0
}

case class Pink() extends Colour {
  val name = "Pink"
  val redVal = 255
  val greenVal = 0
  val blueVal = 127
}

case class CustomColour(redVal: Int, greenVal: Int, blueVal: Int) extends Colour {
  val name = null
}