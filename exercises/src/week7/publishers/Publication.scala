package week7.publishers

trait Manuscript {
  val author: String
  val length: Int
}

trait Periodical {
    val editor: String
    val volume: Int
    val issueNumber: Int
    val manuscripts: Seq[Manuscript]
}
case class Book(val author: String, val length: Int) extends Manuscript {}

case class Issue(val editor: String, val volume: Int, val issueNumber: Int, val manuscripts: Seq[Manuscript]) extends Periodical {}

