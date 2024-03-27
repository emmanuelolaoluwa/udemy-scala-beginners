package exercises.part1Basics

object Functions extends App {

  def aGreetingFunction(name: String, age: Int): String =

    "My name is " + name + "and i am " + age + "years old"

  println(aGreetingFunction("Emmanuel", 27))

  def aRecursiveFunction(number: Int): Int =
    var n = 1
    if (n != number) n * aRecursiveFunction(n+1)
    else n + aRecursiveFunction(n+1)

  println(aRecursiveFunction(3))
}
