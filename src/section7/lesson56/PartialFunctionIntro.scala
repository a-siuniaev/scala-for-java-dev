package section7.lesson56

object PartialFunctionIntro extends App {
  // Partially defined function definition using pattern matching
  val f0: (Int => String) = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  // Same function
  val f1: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  // Compilation error: missing parameter types...
  // i.e. not enough info for type-inference
  /*val f = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }*/

  println(f0(1))
  println(f0(2))
  println(f0(3))
  // scala.MatchError - function is not defined for this element
  println(f0(4))
}
