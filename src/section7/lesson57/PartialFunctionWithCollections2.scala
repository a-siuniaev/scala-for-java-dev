package section7.lesson57

object PartialFunctionWithCollections2 extends App {
  // map cannot receive partial function
  //println(List(0, 1, 2) map {case 1 => "one"; case 2 => "two"})

  // solution: use collect - it filters + maps using partial function
  println(List(0, 1, 2) collect { case 1 => "one"; case 2 => "two" })

  // collectFirst - finds the first element matched by PartialFunction
  println(List(0, 1, 2) collectFirst { case 1 => "one"; case 2 => "two" })

  // filter only Int
  println(List(0, "*", 2) collect { case x: Int => x })

  // filter only Int and maps x => x*x
  println(List(0, "*", 2) collect {case x: Int => x * x})

  // filter only Int and > 0
  println(List(0, "*", 2) collect {case x: Int if x > 0 => x})

}
