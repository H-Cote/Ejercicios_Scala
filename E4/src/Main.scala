//E4
object Main {
  def area(x: Float, y: Float): Float = {
    return x * y;
  }

  def main(args: Array[String]): Unit = {
    val a = scala.io.StdIn.readFloat()
    val b = scala.io.StdIn.readFloat()
    println("area del terreno: "+ area(a, b));
  }





}
