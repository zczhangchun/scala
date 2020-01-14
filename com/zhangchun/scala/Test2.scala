package com.zhangchun.scala

/**
  * @author zhangchun
  */
object Test2 {
  def main(args: Array[String]): Unit = {

    try {
      val r = 10 / 0
    }catch {
      case ex:ArithmeticException => println(ex.printStackTrace())
      case ex:Exception => println(ex.printStackTrace())
    }finally {
      println("finally")
    }
  }

}
