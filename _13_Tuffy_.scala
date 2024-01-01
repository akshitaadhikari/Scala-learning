package Demo
class Dog(name:String , breed: String , Age: Int , colour : String) {
  println(s"name = $name , breed = $breed , age = $Age , colour = $colour")
}
object _13_Tuffy_ extends App {
  var obj = new Dog("Tuffy" ,"laberadog" , 12 , "brown")
}
