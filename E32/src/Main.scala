//E32

object E32{

  def Sort3Int(a: Int,b: Int,c:Int):List[Int] = {

    val lista = List(a,b,c)
    val maximo = lista.max
    val minimo = lista.min
    val inter = a+b+c-maximo-minimo
    val listaOrdenada = List(maximo,inter,minimo)


    return listaOrdenada

  }

  def main(args: Array[String]): Unit = {

    var a = scala.io.StdIn.readInt()
    var b= scala.io.StdIn.readInt()
    var c= scala.io.StdIn.readInt()

    println("Valores ordenados: "+Sort3Int(a,b,c))
  }

}
