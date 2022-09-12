//E27

object E27{

  def MasaCorporal(altura: Double,peso: Double): Double = {

    val numerador = peso
    val denominador = altura*altura
    var BMI = numerador/denominador


    return BMI

  }

 def main(args: Array[String]): Unit = {

   var altura = scala.io.StdIn.readDouble()

   var peso= scala.io.StdIn.readDouble()

   println("Indice de masa corporal "+MasaCorporal(altura,peso))
  }

}
