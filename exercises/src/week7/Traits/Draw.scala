package week7.Traits

object Draw {
  
  def apply(shape: Shape) = shape match {
    case Circle(radius) => s"A circle of radius ${radius}cm"
    case Rectangle(width, height) => s"A rectangle of width ${width}cm and height ${height}cm"
    case Square(sideLength) => s"A square with side length of ${sideLength}cm"
  }
  
}