package week6.auxconstructors

class ClothesWasher {
  var modelName = "uknown"
  var capacity = 0.0

 def this(modelName : String) {
   this()
   this.modelName = modelName
 }
 def this(capacity : Double) {
   this()
   this.capacity = capacity
 }
}