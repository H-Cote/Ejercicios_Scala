//E55

object E55{

  def frecuencias(valor: Double): String =

    if (valor<3e9d) "Radio Waves"
    else if (valor >= 3e9d && valor < 3e12d) "Microwaves"
    else if (valor >= 3e12d && valor < 4.3e14d) "Infrared light"
    else if (valor >=  4.3e14d && valor <  7.5e14d) "Visible light"
    else if (valor >= 7.5e14d && valor < 3e17d) "Ultraviolet light"
    else if (valor >= 3e17d && valor < 3e19d) "X-rays"
    else if (valor >3e17d) "Gamma rays"


    else "Valor no valido"

  def main(args: Array[String]): Unit = {

    var valor = scala.io.StdIn.readDouble()

    println(frecuencias(valor))
  }

}