object Main {
  def mcd(a:Int,b:Int): Int =

    if(b==0) a else mcd(b,a%b)

  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readInt()
    val b = scala.io.StdIn.readInt()
    println(mcd(a,b))
  }
}


