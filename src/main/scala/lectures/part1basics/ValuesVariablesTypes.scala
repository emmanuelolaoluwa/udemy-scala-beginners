package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // x = 2
  // vals are immutable
  // Types of val are optional
  // compiler can infer types

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x //other values can be passed
  val aShort: Short = 4613
  val aLong: Long = 524213513L
  val aFloat: Float = 2.0F
  val aDouble: Double = 3.14

  // Variables
  var aVariable: Int = 4
  aVariable = 5 //side effects allows us to see what our programs are doing


}
