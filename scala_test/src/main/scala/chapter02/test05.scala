package chapter02

import scala.io.StdIn

object test05 {
  def main(args: Array[String]): Unit = {

    println("please enter name")
    val name: String = StdIn.readLine()
    print("age")
    val age: Int = StdIn.readInt()
    println(s"welge ${age} age's ${name} come to ")

  }

}
