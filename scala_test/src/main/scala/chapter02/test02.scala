package chapter02

import chapter01.Student

object test02 {
  def main(args: Array[String]): Unit = {
    var a: Int = 10
    var a1 = 10
    val b1 = 23
    var a2 = 15 // a2 is int

    var a3: Int = 5

    var alice = new Student("alice", 20)
    alice = new Student("Alice", 20)
    alice = null
    val bob = new Student("bob", 23)
    bob.age = 24
    bob.printInfo()



  }

}
