package programmingScala

import scala.annotation.tailrec

object programmingScala extends App {

  class Person(name: String, val age: Int) {

    def greet(name:String): Unit = {
      println(s"${this.name} says hello $name")
    }

  }
  val person = new Person("John", 25)

  println(person.greet("Daniel"))


}