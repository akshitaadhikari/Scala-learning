package Demo

object _15_List1 {
  def main(args:Array[String]) : Unit = {
    val list1:List[String] = List("apple" , "mango" , "banana")
    val list2:List[Int] = List( 1, 2,3 )
    val list3:List[Int] = 1::2::3::4::Nil
    for( vals <-list2){
      println(vals)
    }
    list1.foreach(println)
    list3.foreach(println)
  }

}
