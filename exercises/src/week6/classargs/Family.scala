package week6.classargs

import scala.collection.mutable.ArrayBuffer

class Family {
  var theFamily = ArrayBuffer[String]()
  
  def this(parent1 : String, parent2 : String, child1 : String, child2 : String) {
    this()
    theFamily+= parent1
    theFamily+= parent2
    theFamily+= child1
    theFamily+= child2
  }
  
  def this(parent1 : String, parent2 : String, child1 : String) {
    this()
    theFamily+= parent1
    theFamily+= parent2
    theFamily+= child1
  }
  
  
  def familySize() : Int = {
    theFamily.size
  }
}
