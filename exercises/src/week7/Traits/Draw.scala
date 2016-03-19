package week7.Traits

object Draw {
  
  def apply(shape: Shape) = shape match {
    case Circle(radius, colour) 
      => s"A circle of radius ${radius}cm and colour ${checkColour(colour)}"
    case Rectangle(width, height, colour)
      => s"A rectangle of width ${width}cm, height ${height}cm and colour ${checkColour(colour)}"
    case Square(sideLength, colour) 
      => s"A square with side length of ${sideLength}cm and colour ${checkColour(colour)}"
  }
  
  def checkColour(colour: Colour) : String = colour.name match {
    case null 
      => colour.description
    case _
      => colour.name

  }
  
}