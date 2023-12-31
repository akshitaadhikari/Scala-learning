package Demo
class Smartphone{
  var Price:Int = 16000
  var Model:String = "Apple"

  def Display(): Unit = {
    println(s"price is : $Price")
    println(s"model is : $Model")
  }
}
object _12_SmartphoneApple_ extends App {
  var Apple= new Smartphone
  Apple.Display()
}
