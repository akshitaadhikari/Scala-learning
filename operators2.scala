package Demo

object operators2 {
  def main(args: Array[String]) : Unit = {
    val x= 10
    val y = 25
    println(s"$x = $y: ${x==y}")
    println(s"$x != $y: ${x!=y}")

    println(s"$x > $y: ${x>y}")
    println(s"$x < $y: ${x<y}")

    println(s"$x >= $y: ${x>=y}")
    println(s"$x <= $y: ${x<=y}")
  }

}
