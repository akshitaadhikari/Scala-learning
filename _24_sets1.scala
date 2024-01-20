package Demo

object _24_sets1 extends App{
  val set1 :Set[Int] = Set(2,4,7,2,4,5)
  println(set1)

  val set2 :Set[Int] = set1 + 9
  println(set2)

  val set3 :Set[Int] = set1 -2
  println(set3)

  val a:Boolean = set1.contains(4)
  print(a)
}
