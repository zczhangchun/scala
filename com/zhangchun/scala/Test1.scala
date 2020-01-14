package com.zhangchun.scala

import scala.io.StdIn
import scala.util.control.Breaks._
/**
  * @author zhangchun
  */
object Test1 {

  def main(args: Array[String]): Unit = {

//    def m1() = println("hello")
//    def m2() ={
//      m1 _
//    }
//
//
//
//
//
//    println(m2())

//    def m1(f : () => Int): Int ={
//      f() + 10
//    }
//
//    def m2() ={
//      10
//    }
//
//    m1


//    def m1(f : (Int) => Unit): Unit ={
//      f(10)
//    }
//
//    def m2(i: Int): Unit ={
//      println(i)
//    }
//
//
//    m1(m2)






//    val flag = true
//      val result = if(!flag){
//        1
//      }
//    println(result)
//

//    val res = for (i <- 1 to 10) yield i * 2
//    println(res)

//    for(i <- 1 to 9; j <- 1 to i){
//      print(s"${j} * ${i} = ${i * j} \t")
//      if (i == j)
//        println()
//    }
//    var flag = 40
//    while(flag <= 100){
//      if (flag % 3 == 0)
//        println(flag)
//      flag += 1
//    }

//    while(flag <= 200){
//      if (flag % 2 == 0)
//        println(flag)
//      flag += 1
//    }



//    breakable {
//      while (flag) {
//        println("hello")
//        if (flag)
//          break()
//      }
//    }


    //
//    var sum = 0
//    breakable {
//      for (i <- 1 to 100) {
//        sum += i
//        if (sum >= 20) {
//          println(sum)
//          break()
//        }
//      }
//    }

//    for(i <- 3 to 1 ){
//      println(i)
//    }

//    breakable {
//      for (i <- 3 to 1 by -1) {
//
//        println("请输入用户名")
//        val username = StdIn.readLine()
//        println("请输入密码")
//        val password = StdIn.readLine()
//        if (username == "张无忌" && password == "888") {
//          println("登录成功")
//          break()
//        } else {
//          if (i != 1)
//            println(s"还有 ${i - 1} 次机会")
//
//        }
//
//
//      }
//    }

//    val name = "zhang"
//    val paw = "123"
//    println(s"name = ${name} :paw ${paw}")
//    println("name=%s : paw=%s", name, paw)
//    println("name =" + name + "pwd = " + paw)

    var b : Byte = 3
    var c : Int = 1

//    def hello() : Unit = {
//      println("hello")
//    }
//
//    hello()

//    def hello1 = "hello"
//    println(hello1)

//    def m1() ={
//      "zhangsan"
//    }

//    def m1(): Unit ={
//      println("hello")
//    }
//
//    def m2(i : Int)={
//
//      def m3(j : Int)={
//        i * j
//      }
//
//      m3 _
//
//    }
//
//    def m4(i : Int)(j : Int): Int ={
//      i * j
//    }
//
//    println(m4(3)(4))

    //把函数当成参数传递

//    def m1()={
//      1
//    }
//
//    def m2()={
//      m1 _
//    }


//    def m1( f : () => Int): Int ={
//      f() + 5
//    }
//
//    m1(() => {1})
//
//    def m2()={
//      10
//    }

//    println(m1(m2))

//    def m1(arg : Int): Unit ={
//      println(arg)
//    }
//
//    def m2(f : (Int) => Unit): Unit ={
//      f(10)
//    }

//    def m1(f : (Int) => Unit): Unit ={
//      f(10)
//    }
//
//    //匿名函数
//    m1((i : Int)=>{println(i)})
//    //因为m1函数的参数列表已经声明了参数类型，所以传递时可以省略参数列表的类型
//    m1((i) => {println(i)})
//    //因为函数只有一条语句，可以省略大括号
//    m1((i) => println(i))
//    //因为参数只用一回，可以省略，函数体有使用该参数的，可以用_代替
//    m1(println(_))
  }

}



