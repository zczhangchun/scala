package com.zhangchun.scala

/**
  * @author zhangchun
  */
class TestSingleTon extends App {

}

class SingleTon private() {}
object SingleTon{
  private var s:SingleTon = new SingleTon
  def getInstance(): SingleTon ={


  }
}
