
//E15

object E15{

  def medidas(feet: Float): (Float,Double,Double) = {

    val in = feet * 12
    val yd = feet * 0.3333
    val mi = feet * 1.894e-4d

    var tuple = (in,yd,mi)

    return tuple

  }


  def main(args: Array[String]): Unit = {
    val u = scala.io.StdIn.readInt()
    println("(pulgadas,yardas,millas) ="+ medidas(u))
  }



}