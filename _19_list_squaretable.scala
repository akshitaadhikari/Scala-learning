package Demo

object _19_list_squaretable extends App{
  def Square(x:Int) : Int = x *x
  val range:Range =1 to 10
  val result:List[Int] = range.map(Square).toList
  println(result)

  def cube(x: Int): Int = x * x *x

  val range1: Range = 1 to 10
  val result1: List[Int] = range1.map(cube).toList
  println(result1)

}
