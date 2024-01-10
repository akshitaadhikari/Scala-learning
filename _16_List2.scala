package Demo

object _16_List2 extends App{
  val List1:List[Int] = List(1,3,6,2,5)
  val List2:List[Int] = List(3,5,2,4)
  val List3:List[Int] = List()
  val head:Int = List1.head
  val tail:List[Int] = List2.tail
  val ans:Boolean = List1.isEmpty
  val ans1:Boolean = List2.isEmpty
  val ans2:Boolean = List3.isEmpty
  println(head)
  println(tail)
  println(ans)
  println(ans1)
  println(ans2)
}
