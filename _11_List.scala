package Demo

object _11_List {
  def main(args: Array[String]) : Unit = {
    val num1 : List[Int] = List( 1, 2, 3, 4, 5)
    val num2 : List[Int] = List( 12, 25, 33, 44, 65)
    val num3 : List[Int] = num1 ++ num2
    println(num3)
    val num4 : List[Int] = num2.reverse
    println(num4)
  }

}
