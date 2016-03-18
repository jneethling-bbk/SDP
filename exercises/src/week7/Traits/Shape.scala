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

case class Rectangle(height : Double, width : Double) extends Shape {
  val sides = 4
  val perimeter = (height * 2) + (width * 2)
  val area = height * width
}

case class Square(height : Double) extends Shape {
  val sides = 4
  val perimeter = height * 4
  val area = height * height
}