package section7.lesson56

object PartialFunctionOrElseMethod extends App {
  //
  // Method: orElse
  val f0: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  val default0: PartialFunction[Int, String] = {case x => "<undefined>"}
  println("f(2) = " + (f0 orElse default0) (2))
  println("f(4) = " + (f0 orElse default0) (4))

  val g0 = (k: Int) => (f0 orElse default0)(k)
  println("f(2) = " + g0(2))
  println("f(4) = " + g0(4))



  //
  // Using orElse to "glue" functions together (thus extending domain)
  val f1: PartialFunction[Int, String] = {case 1 => "one"}
  val f2: PartialFunction[Int, String] = {case 2 => "two"}
  val f3: PartialFunction[Int, String] = {case 3 => "three"}

  val h: PartialFunction[Int, String] = f1 orElse f2 orElse f3
  println("h(2) = " + (h(2)))



  //
  // orElse order is important! (in case when domains intersect)
  val h1: PartialFunction[Int, String] = {case 1 => "one"; case 2 => "two"}
  val h2: PartialFunction[Int, String] = {case 2 => "***"; case 3 => "three"}
  val h3: PartialFunction[Int, String] = {case 3 => "***"}

  val p: PartialFunction[Int, String] = h1 orElse h2 orElse h3

  // You can never get "***" output
  println("p(2) = " + (p(2)))
  println("p(3) = " + (p(3)))
}
