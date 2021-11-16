package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object test06_FileIO {
  def main(args: Array[String]): Unit = {
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java writer")
    writer.close()
  }

}
