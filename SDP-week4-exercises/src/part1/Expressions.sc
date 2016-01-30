package part1

object Expressions {
  var sky = "sunny"                               //> sky  : String = sunny
  var temp = 80.1                                 //> temp  : Double = 80.1
  
  sky.equals("sunny") && temp > 80                //> res0: Boolean = true
  
  (sky.equals("sunny") ||
  	sky.equals("partly cloudy")) && temp > 80 //> res1: Boolean = true
   
  (sky.equals("sunny") ||
   sky.equals("partly cloudy")) &&
   (temp > 80 || temp < 20)                       //> res2: Boolean = true
   
   var celsius = (temp - 32) * (5.0/9)            //> celsius  : Double = 26.72222222222222
   
   var Fahrenheit = (celsius * (9.0/5)) + 32      //> Fahrenheit  : Double = 80.1
}