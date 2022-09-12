import scala.collection.mutable

object Main {

  def randomString(): String = {
    val len = 2
    val rand = new scala.util.Random(System.nanoTime)
    val sb1 = new StringBuilder(len)
    val sb2 = new StringBuilder(len)
    val sb3 =new StringBuilder(len)
    val ab1 ="0123456789"
    val ab2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until len) {
      sb1.append(ab1(rand.nextInt(ab1.length)))
      sb2.append(ab2(rand.nextInt(ab2.length)))
      sb3.append(sb1)
      sb3.append(sb2)
    }
    sb3.toString
  }

  def main(args: Array[String]): Unit = {



    println(randomString())
  }





}