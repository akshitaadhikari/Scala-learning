package Demo

object _17_List_concatenate extends App{
  val list1 : List[Int] = List(1,2,3,4,5)
  val list2:List[Int] = List(6,7,8,9)
  val add:List[Int] = list1++list2
  val add1:List[Int] = list1 ::: list2
  println(add)
  println(add1)
}
