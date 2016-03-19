package week7.Traits

import week4.atomicscala.AtomicTest._

object DrawingTest extends App {
  
  Draw(Circle(10, new Red)) is "A circle of radius 10.0cm and colour Red"
  Draw(Rectangle(3, 4, new Yellow)) is "A rectangle of width 3.0cm, height 4.0cm and colour Yellow"
  Draw(Square(5, new Pink)) is "A square with side length of 5.0cm and colour Pink"
  Draw(Circle(2, new CustomColour(255, 255, 255))) is "A circle of radius 2.0cm and colour Light"
  Draw(Circle(2, new CustomColour(0, 0, 0))) is "A circle of radius 2.0cm and colour Dark"
}