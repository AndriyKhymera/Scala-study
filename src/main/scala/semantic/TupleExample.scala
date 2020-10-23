class TupleExample {

}

object TupleExample{
  def main(args: Array[String]): Unit = {
    val tuple1 = ("exampleString1", 1)
    println(tuple1)
    val tuple2:(String, Int) = ("exampleString2",2)
    println(tuple2)

    val tuple3:Tuple2[String, Int] = new Tuple2("exampleString3", 3)
    println(tuple3)

  }
}
