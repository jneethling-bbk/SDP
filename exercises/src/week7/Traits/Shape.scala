package week7.Traits

trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius : Double) extends Shape {
  val sides = 1
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

trait RectangularShape extends Shape {
  def height: Int
  def width: Int
  val sides = 4
  val perimeter = (height * 2) + (width * 2)
  val area = height * width
}

case class Rectangle(height : Double, width : Double) extends RectangularShape

case class Square(sideLength : Double) extends RectangularShape {
  val height = sideLength
  val width = sideLength
  
}