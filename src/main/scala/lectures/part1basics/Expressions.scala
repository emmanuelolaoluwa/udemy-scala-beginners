package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>

  println(1 == x) // Boolean
  // == (equality) != (not equal)

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //also works with -= *= /=  ... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE and or TYPE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)


  var i = 0
  while (i < 10) {
    print(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks : is an expression, its value is the last expression
  // Enclosed scope
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }

  // 1 . Difference between "hello world" vs println("hello world")
  // 2.
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
}
