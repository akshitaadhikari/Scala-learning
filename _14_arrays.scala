package Demo

object _14_arrays{
  def main(args: Array[String]): Unit = {
    val array1: Array[Int] = Array(1,2,3)
    println(array1)
    val array2: Array[Int] = Array(4,5,3)
    val array3: Array[String] = Array("apple","banana","mango")
    val array4: Array[Int] = Array(0, 1)
    //val array5: Array[Int] = array1 ++ array2
    val array6: Array[Int] = Array.concat(array1, array2)
    val ab: Int = array1.max
    //val ba :Int = array2.min
    val a: Int = array1(1)
    
    println(array2)
    println(array3)
    println(array4)
    //println(array5)
    println(array6)
    println(ab)
    //println(ba)
    println(a)

    val length:Int = array3.length
    println(length)
  }
}
