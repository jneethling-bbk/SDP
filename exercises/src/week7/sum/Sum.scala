package week7.sum

trait Sum[A, B] {
  
}

case class Left[A, B](value: A) extends Sum[A, B]

case class Right[A, B](value: B) extends Sum[A, B]