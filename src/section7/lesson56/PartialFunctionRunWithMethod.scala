package section7.lesson56

object PartialFunctionRunWithMethod extends App {
  val f: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  f.runWith(println)(2) // "two"
  f.runWith(println)(4) // nothing will be printed
}
