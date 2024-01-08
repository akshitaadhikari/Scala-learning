package Demo

object bitwiseoperators {
  def main(args : Array[String]) : Unit= {
    val a= 10
    val b = 20
    val c = 5

    if( a > b && b> c){
      println("both conditions are true")

    } else{
      println("at least one condition is false.")
    }
    if (a > b || b > c) {
      println("at least one of the conditions is true")

    } else {
      println("all conditions are false.")
    }
  }

}
