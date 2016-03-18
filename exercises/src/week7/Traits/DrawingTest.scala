package week7.Traits

import week4.atomicscala.AtomicTest._

object DrawingTest extends App {
  
  Draw(Circle(10)) is "A circle of radius 10.0cm"
  Draw(Rectangle(3, 4)) is "A rectangle of width 3.0cm and height 4.0cm"
  Draw(Square(5)) is "A square with side length of 5.0cm"
}