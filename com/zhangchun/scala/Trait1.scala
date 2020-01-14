package com.zhangchun.scala

/**
  * @author zhangchun
  */
trait Trait1 {
  def getConnect(): Unit={}
  def test(name: String)
}
trait Trait2 {
}

class A{}
class B{}
class C extends A with Trait1 with Trait2 {

  override def test(name: String): Unit = ???
}

