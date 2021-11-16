package chapter02

object test04string {
  def main(args: Array[String]): Unit = {
    val name:String = "alice"
    val age: Int = 19
    printf("%d岁的%s在尚硅谷学习", age, name)
    println()

    println(s"${age}岁的${name} is here")
    val num = 2.342
    println(f"The number is ${num}%2.2f")
    println(raw"${num} 1231%51")

    val sql = s"""
       |select *
       |from
       |  student
       |where
       |  name = ${name}
       |and
       |  age > ${age}
       |""".stripMargin

    println(sql)

  }
}
