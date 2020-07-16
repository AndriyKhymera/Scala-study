package semantic

class Inheritance(id: Int) {

  //  def number = number
  def number() = id

  override def toString: String = {
    "To string override. Inheritance" + id
  }
}

object Example{
  def main(args: Array[String]): Unit = {
    val inheritance = new Inheritance(1)
    println("ID: " + inheritance.number());
    println("object" + inheritance)
  }
}