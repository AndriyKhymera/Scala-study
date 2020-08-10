package semantics2

class Inheritance(id: Int, rand: Int) {
// getters an
//  If we specify method without parameters we would use it with it too
  def number2 = rand
  def number() = id

  override def toString: String = {
    "To string override. Inheritance" + id
  }
}
object InheritanceSingletoneObject{

  def hello2(name: String): Unit ={
    printf("Hello ${name}", name)
  }

  sealed trait Andrii;
  sealed trait Vasia;

}

object Example{
  def main(args: Array[String]): Unit = {
    val inheritance = new Inheritance(1,2)
    var inheritance2 = new Inheritance(1,2)
    println("ID: " + inheritance.number());
    println("Rand: " + inheritance.number2);
    println("object" + inheritance)
  }
}