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
//    oncePerSecond(printHello)

    println(fuctorial(3))
//    val add2Func = returnFunction(2,3)
//    println(add2Func(0,0))
//    println(add2Func(1,1))
  }

  def fuctorial(number: Int): Int={
    if (number == 1){
      println (number)
      number
    }else{
      println (number)
      number * fuctorial(number-1)
    }
  }

}
