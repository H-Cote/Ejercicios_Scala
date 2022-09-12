object Main {
  def main(args: Array[String]): Unit = {

    var palabra = ""
    var valor=0
    var suma=0
    while (palabra != "exit") {

      valor = scala.io.StdIn.readInt()
      palabra = scala.io.StdIn.readLine()

      if(valor.isInstanceOf[Int] ) { suma=suma+valor; println(suma)} else {println("no es una entrada valida")}


      //println(s"command: $palabra")

    }
  }
}