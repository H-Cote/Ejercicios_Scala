object Main {

  def zoo(args: Array[String]): Unit = {

    val suma = 0
    var edad = 1
    while (edad != 0) {
      edad = scala.io.StdIn.readInt()

      if (edad <= 2) {suma = suma + 0;}
      else if (edad <= 12) {suma = suma + 14;}
      else if (edad <= 64) {suma = suma + 23;}
      else {suma = suma + 18;}

    }
return suma
  }

  //def main(args: Array[String]): Unit = {

    //println(zoo())
  //}


}