package week7.Traits

// using sealed traits
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
  def colour: Colour
}

case class Circle(radius : Double, colour: Colour) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

trait RectangularShape extends Shape {
  def height: Double
  def width: Double
  val sides = 4
  val perimeter = (height * 2) + (width * 2)
  val area = height * width
}

case class Rectangle(height : Double, width : Double, colour: Colour) extends RectangularShape

case class Square(sideLength : Double, colour: Colour) extends RectangularShape {
  val height = sideLength
  val width = sideLength
  
}