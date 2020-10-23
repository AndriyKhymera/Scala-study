object Functional2 {

  def oncePerSecond(callbackFunction: () => Unit): Unit ={
    for( i <- 1 to 10){
      println( "Value of i: " + i );
      callbackFunction()
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String]): Unit ={
    oncePerSecond(() =>{
      println("Hello")
    })
  }

}
