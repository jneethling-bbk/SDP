package week7.List

object ListDriver extends App {
  
  val list: LinkedList[Int] = Pair(1, Pair(2, Pair(3, Empty())))
  list.isInstanceOf[LinkedList[Int]] // returns true
  list.head // returns 1 as an Int
  list.tail.head // returns 2 as an Int
  list.tail.tail // returns Pair(3, Empty()) as a LinkedList[Int]

  
}