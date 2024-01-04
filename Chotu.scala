package Demo
object Chotu {
  def main(args:Array[String]): Unit = {
    val myTuple: (Int, String, Double) = (42,"you r so bad",3.14)
    val first: Int = myTuple._1
    println(first)
    val second: String = myTuple._2
    println(second)
    print(myTuple)
  }
}
