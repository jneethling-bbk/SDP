package part1

object Vectors {
  val sv = Vector("a", "b", "c")                  //> sv  : scala.collection.immutable.Vector[String] = Vector(a, b, c)
  val iv = Vector(1, 2, 3)                        //> iv  : scala.collection.immutable.Vector[Int] = Vector(1, 2, 3)
  
  val vv = Vector(sv, iv)                         //> vv  : scala.collection.immutable.Vector[scala.collection.immutable.Vector[An
                                                  //| y]] = Vector(Vector(a, b, c), Vector(1, 2, 3))
  val wv = Vector("The", "dog", "visited",  "the", "fire", "station")
                                                  //> wv  : scala.collection.immutable.Vector[String] = Vector(The, dog, visited, 
                                                  //| the, fire, station)
  var sentence = ""                               //> sentence  : String = ""
  for (s <- wv) {
  	println(s)
    sentence = sentence + " " + s
  }                                               //> The
                                                  //| dog
                                                  //| visited
                                                  //| the
                                                  //| fire
                                                  //| station
  println(sentence)                               //>  The dog visited the fire station

	iv.sum                                    //> res0: Int = 6
	iv.min                                    //> res1: Int = 1
	iv.max                                    //> res2: Int = 3
	
	val dv = Vector(1.0, 1.1, 1.2)            //> dv  : scala.collection.immutable.Vector[Double] = Vector(1.0, 1.1, 1.2)
	
	dv.sum                                    //> res3: Double = 3.3
	dv.min                                    //> res4: Double = 1.0
	dv.max                                    //> res5: Double = 1.2


}