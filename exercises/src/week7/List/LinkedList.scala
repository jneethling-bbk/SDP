package week7.List

sealed trait LinkedList[A] {
  def head: A
  def tail: LinkedList[A]
  
}

final case class Pair[A](head: A, tail: LinkedList[A]) extends LinkedList[A]

// Not getting this to work...
final case class Empty[A]() extends LinkedList[A] {}