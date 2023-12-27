package Demo
class Smartphone( model : String , price : Int) {
  println("model is :" + model +" price is :" + price)
}
object _8_Smartphone {
  def main(args : Array[String]) : Unit ={
    val obj = new Smartphone( "nokia" , 23000)
  }
}
