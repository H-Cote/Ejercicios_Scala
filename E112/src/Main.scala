import scala.collection.mutable.ListBuffer


object E112 {
  def main(args: Array[String]): Unit = {
    val lista = new ListBuffer[Int]()
    var valor = 1
    var palabra = "a"

    while (palabra != " ") {
      palabra = scala.io.StdIn.readLine()

      valor = scala.io.StdIn.readInt()

      lista += valor
      val prom=lista.sum/lista.length
      println(s"Promedio: ${prom}")

      for (i <-0 until lista.length) {

        if (lista(i)<prom) { println(s"menores:$lista(i)")}

      }

    }

  }

}