object Main {
  def cantidad(list: List[Int], maxi: Int, mini: Int) : Unit = {

    var contador=0

    for(i<- 0 to list.length ) {
      if (list(i)>=mini && list(i)<maxi) {contador=contador+1}
    }
    return contador
}

  def main(args: Array[String]): Unit = {
   val a=List(4,6,5,3,8,4,2,2,5,8,5,4,3,5,3,2,75,74,3)
    println(cantidad(a,30,1))
  }


}