package part1

object Classes_and_Objects {
  val r1 = 1 to 10                                //> r1  : scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7,
                                                  //|  8, 9, 10)
  println(r1.step)                                //> 1
  
  val r2 = 1 to 10 by 2                           //> r2  : scala.collection.immutable.Range = Range(1, 3, 5, 7, 9)
  println(r2.step)                                //> 2
  
  var s1 = "Sally"                                //> s1  : String = Sally
  var s2 = "Sally"                                //> s2  : String = Sally
  
  if (s1.equals(s2)) {
  	println("s1 and s2 are equal")
  } else {
  	println("s1 and s2 are not equal")
  }                                               //> s1 and s2 are equal
  val myHippo = new Hippo                         //> myHippo  : part1.Hippo = part1.Hippo@ea639
  val myLion = new Lion                           //> myLion  : part1.Lion = part1.Lion@124753a
  val myTiger = new Tiger                         //> myTiger  : part1.Tiger = part1.Tiger@1a6e353
  val myMonkey = new Monkey                       //> myMonkey  : part1.Monkey = part1.Monkey@ac6e3
  val myGiraffe = new Giraffe                     //> myGiraffe  : part1.Giraffe = part1.Giraffe@1be98f5
  
	val anotherLion = new Lion                //> anotherLion  : part1.Lion = part1.Lion@1adae5d
	val anotherGiraffe = new Giraffe          //> anotherGiraffe  : part1.Giraffe = part1.Giraffe@17f6480
	
	val sailboat = new Sailboat               //> sailboat  : part1.Sailboat = part1.Sailboat@16e8792
	val sb1 = sailboat.raise()                //> sb1  : String = Sails raised
	assert(sb1 == "Sails raised", "Expected Sails raised, Got " + sb1)
	val sb2 = sailboat.lower()                //> sb2  : String = Sails lowered
	assert(sb2 == "Sails lowered", "Expected Sails lowered, Got " + sb2)
	val motorboat = new Motorboat             //> motorboat  : part1.Motorboat = part1.Motorboat@12cbfa
	val mb1 = motorboat.on()                  //> mb1  : String = Motor on
	assert(mb1 == "Motor on", "Expected Motor on, Got " + mb1)
	val mb2 = motorboat.off()                 //> mb2  : String = Motor off
	assert(mb2 == "Motor off", "Expected Motor off, Got " + mb2)
	
	val flare = new Flare                     //> flare  : part1.Flare = part1.Flare@cf57e3
	val f1 = flare.light                      //> f1  : String = Flare used!
	assert(f1 == "Flare used!", "Expected Flare used!, Got " + f1)

	val sailboat2 = new Sailboat              //> sailboat2  : part1.Sailboat = part1.Sailboat@6e6d5e
	val signal = sailboat2.signal()           //> signal  : String = Flare used!
	assert(signal == "Flare used!", "Expected Flare used! Got " + signal)

	val motorboat2 = new Motorboat            //> motorboat2  : part1.Motorboat = part1.Motorboat@16532d6
	val flare2 = motorboat2.signal()          //> flare2  : String = Flare used!
	assert(flare2 == "Flare used!", "Expected Flare used!, Got " + flare2)

}