object E84 {

  def Median(a: Double, b: Double, c: Double): Double = {

    val lista = List(a, b, c)
    val maximo = lista.max
    val minimo = lista.min
    val inter = a + b + c - maximo - minimo
    val listaOrdenada = List(maximo, inter, minimo)


    return inter

  }

  def main(args: Array[String]): Unit = {

    var a = scala.io.StdIn.readDouble()
    var b = scala.io.StdIn.readDouble()
    var c = scala.io.StdIn.readDouble()

    println("La mediana es: " + Median(a, b, c))
  }
}