package com.zhangchun.scala

/**
  * @author zhangchun
  */
object Sneak {
  def main(args: Array[String]): Unit = {
    var oracleDB = new OracleDB with  Operate3
    oracleDB.insert(1)
  }
}

class OracleDB {
}

abstract class MySQL3 {
}

trait Q{
  def insert(id: Int):Unit
}


trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据 = " + id)
  }
}

