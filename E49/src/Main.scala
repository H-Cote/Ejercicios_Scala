//E49

object E49{

  def sismo(magnitud: Double) : String =
    if (magnitud < 2) "Micro earthquake"
    else if (magnitud >=2 && magnitud<3) "Very minor earthquake"
    else if (magnitud >=3 && magnitud<4) "Minor earthquake"
    else if (magnitud >=4 && magnitud<5) "Light earthquake"
    else if (magnitud >=5 && magnitud<6) "Moderate earthquake"
    else if (magnitud >=6 && magnitud<7) "Strong earthquake"
    else if (magnitud >=7 && magnitud<8) "Major earthquake"
    else if (magnitud >=8 && magnitud<10) "Great earthquake"
    else if (magnitud<10) "Meteoric earthquake"

    else "Valor no valido"

  def main(args: Array[String]): Unit = {

    var mag = scala.io.StdIn.readDouble()

    println(sismo(mag))
  }

}
