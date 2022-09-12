object E72 {
  def palindromo(palabra:String):String = {
    val len = palabra.length;
    for(i <- 0 until len/2) {
      if(palabra(i) != palabra(len-i-1)) return "No es palindromo";
    }
    return "Es palindromo";
  }

  def main(args: Array[String]): Unit = {

    var valor = scala.io.StdIn.readLine()

    println(palindromo(valor))
  }



}


//ventana

//v=0
//_____________________________
//a=6=len-1=numero fijo



