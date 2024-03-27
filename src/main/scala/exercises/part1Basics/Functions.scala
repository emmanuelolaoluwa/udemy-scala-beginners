package exercises.part1Basics

object Functions extends App {

  def aGreetingFunction(name: String, age: Int): String =

    "My name is " + name + "and i am " + age + "years old"

  println(aGreetingFunction("Emmanuel", 27))

  def aFactorialFunction(n: Int): Int =

    if (n <= 0) 1
    else n * aFactorialFunction(n-1)


  println(aFactorialFunction(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n-2)

  println(fibonacci(8))

  def isPrime(n:Int): Boolean = {

    def isPrimeUntil(t: Int): Boolean =
      if (t<=1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(37))
}
