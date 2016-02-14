package week6.classargs

import scala.collection.mutable.ArrayBuffer

class  FlexibleFamily {
  var theFamily = ArrayBuffer[String]()
    
  def this(parent1 : String, parent2 : String, children : String*) {
    this()
    theFamily+= parent1
    theFamily+= parent2
    for (child <- children) {
      theFamily+= child
    }
  }
  
  def familySize() : Int = {
    theFamily.size
  }
}