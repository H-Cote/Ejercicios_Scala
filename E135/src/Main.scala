object Main {
  def anagramas(string1: String, string2: String): String = {
    if (string1.sorted == string2.sorted) "Son anagramas"
    else "No son anagramas"
  }

  def main(args: Array[String]): Unit = {

    println(anagramas("live","evil"))
  }


}