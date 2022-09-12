import scala.collection.mutable.ListBuffer

object Main {


  def main(args: Array[String]): Unit = {

    val lista= new ListBuffer[Int]()
    var valor = 1
    while (valor != 0) {
      valor = scala.io.StdIn.readInt()

      lista+=valor

     // println(s"lista: ${lista}")
      println(s"lista: ${lista.reverse}")
      for (i <-0 until lista.length) {
        println(s"lista: ${lista.reverse(i)}")
      }


    }

  }


}