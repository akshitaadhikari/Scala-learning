package Demo

object _10_Arrays1 {
  def main(args: Array[String]) : Unit ={
    val Array1 : Array[Int] = Array(1,2,3,4,5,6,7,8)
    val Array2 : Array[Int] = Array(7,4,2,6,3,5,6,4)
    val add :Array[Int] = Array1 ++ Array2
    println(add)
  }

}
