package Demo

object _26_setoperations extends App{
  val set1:Set[Int] = Set(2,4,5)
  val set2:Set[Int] = Set(5,2,7)

  val set3:Set[Int] = set1.union(set2)
  println(set3)

  val set4:Set[Int] = set1.intersect(set2)
  println(set4)

  val set5:Set[Int] = set1.diff(set2)
  println(set5)

  println("minimum :" + set1.min)

  println("maximum :" + set2.max)
}
