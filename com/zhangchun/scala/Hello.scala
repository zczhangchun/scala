package com.zhangchun.scala

/**
  * @author zhangchun
  */
object Hello {
  def main(args: Array[String]): Unit = {
    val name = "zhangsan"
    val age = 1
    val url = "www.baidu.com"
    println(name + ":" + age + ":" + url)
    printf("name=%s，age=%s，url=%s", name, age, url)
    println(s"name=$name")
    val cat = new Cat()

  }

}
class Cat{

  var age:Int = _

}