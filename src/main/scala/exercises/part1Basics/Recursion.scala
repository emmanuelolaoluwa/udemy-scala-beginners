package exercises.part1Basics
import scala.annotation.tailrec
object Recursion extends App {

  @tailrec
  def concatenate(aString: String, n: Int, accumulator: String): String = {

    if (n <= 0) accumulator
      else concatenate(aString, n - 1, aString + accumulator)

  }
  println(concatenate("Hello", 3, ""))

  def isPrime(n: Int): Boolean = {

    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =

      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)

  }

  println(isPrime(2003))
  println(isPrime(629))


}
