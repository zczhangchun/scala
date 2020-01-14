package com.zhangchun.scala

/**
  * @author zhangchun
  */
class Associated(cName: String) {
}
object Associated{
  def apply(cName: String): Associated = new Associated(cName)
}
