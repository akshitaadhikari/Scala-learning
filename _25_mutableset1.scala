package Demo
import scala.collection.mutable
object _25_mutableset1 extends App{
  val set1:mutable.Set[String] = mutable.Set("a" , "b" , "c")
  set1.add("d")
  set1.remove("c")
  println(set1)
}
