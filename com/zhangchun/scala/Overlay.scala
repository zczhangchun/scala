package com.zhangchun.scala

/**
  * @author zhangchun
  */
object Overlay {
  def main(args: Array[String]): Unit = {
    var mySQL = new MySQL4 with DB4 with  File4
    mySQL.insert(1)
  }

}

trait Operate4 {
  println("Operate4...")
  def insert(id : Int)
}
trait Data4 extends Operate4 {
  println("Data4")
  override  def insert(id : Int): Unit = {
    println("插入数据 = " + id)
  }
}
trait DB4 extends Data4 {
  println("DB4")
  override def insert(id : Int): Unit = {
    print("向数据库")
    super.insert(id)
  }
}
trait File4 extends  Data4 {
  println("File4")
  override def insert(id : Int): Unit = {
    print("向文件")
    super.insert(id)
  }
}
class MySQL4 {}

