package semantic

object ImplicitParamsExample extends App {
  val context1 = Context[String]("String1")
  implicit val context2 = Context[String]("String2")
//  this would cause ambiquous error as we have two same vals
//  implicit val context3 = Context[Int]("int1")
  val context4 = Context[Int]("int2")
  printContextString(1)

  case class Context[T](contextString: String)
//  case class Context()

  def printContextString[T] (someNum: Int)(implicit context: Context[T]): Unit = {
    println(someNum)
    println(context.contextString)
  }

}
