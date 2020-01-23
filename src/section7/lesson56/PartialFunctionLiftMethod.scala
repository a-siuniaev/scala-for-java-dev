package section7.lesson56

object PartialFunctionLiftMethod extends App {
  val f0: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  // Bad!
  // We can do it since PartialFunction extends Function1
  // But real signature is Int => String or Exception
  val g0: Int => String = f0

  // Good!
  val g1: Int => Option[String] = f0.lift

  // Reverse method - here f1 is equivalent to f0
  val f1: PartialFunction[Int, String] = g1.unlift



  //
  // How to convert Function to PartialFunction
  val h: Int => Int = _ + 1

  val h1: PartialFunction[Int, Int] = PartialFunction.fromFunction(h1)
  val h2: PartialFunction[Int, Int] = {case x => h1(x)}


}
