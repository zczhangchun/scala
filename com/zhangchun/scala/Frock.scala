package com.zhangchun.scala

/**
  * @author zhangchun
  */
class Frock {
    var serialNumber : Int = _
    def getSerialNumber : Int = {
      serialNumber
    }
  serialNumber = Frock.getNextNum
}

object Frock{
  var num : Int = 10000

  def apply: Frock = {
    num = num + 1
    new Frock()
  }
  def getNextNum: Int = {
    num += 100
    num
  }
}
