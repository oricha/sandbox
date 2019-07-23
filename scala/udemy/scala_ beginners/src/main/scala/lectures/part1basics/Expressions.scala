package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||
  // IF expression
  val aCondition = true
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  val aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(1 + 3)
  val aWeirdValue = (aVariable = 3) // Unit === void
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!
  val someValue = {
    2 < 3
  }
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks
  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }

  // 1. difference between "hello world" vs println("hello world")?
  // 2.
  var aVariable = 2
  println(someValue)
  var i = 0
  println(someOtherValue)

}
