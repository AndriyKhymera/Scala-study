package semantic
//Case class example
abstract class Tree()
case class Sum(left: Tree, right: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(value: Int) extends Tree


object ExampleTree{

//  This notation defines a function which, when given the string "x" as argument, returns the integer 5, and fails with an exception otherwise.
//  { case "x" => 5 }
//  From then on, the type Environment can be used as an alias of the type of functions from String to Int
  type Environment = String => Int

  def eval(tree: Tree, env: Environment): Int = tree match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n)    => env(n)
    case Const(v)  => v
  }

  def main(args: Array[String]): Unit = {
    var sum = Sum(Const(1), Const(2))
    var sum1= Const(3);
    sum1.value
  }
}