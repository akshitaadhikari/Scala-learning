package Demo

object _21_tuples1 {
  def main(args:Array[String]):Unit ={
    val tuple:(Int , Int ,String , Double) = (1,2,"apple",7.3)
    val first:Int = tuple._1
    println(first)
    val third: String = tuple._3
    println(third)
    val last: Double = tuple._4
    println(last)
  }
}
