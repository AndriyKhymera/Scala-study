object Functional {

  def oncePerSecond(callbackFunction: () => Unit): Unit ={
    for( i <- 1 to 10){
      println( "Value of i: " + i );
      callbackFunction()
      Thread.sleep(1000)
    }
  }

  def printHello(): Unit ={
    println("Hello")
  }

  def main(args: Array[String]): Unit ={
    oncePerSecond(printHello)
  }

}
