package section7.lesson56

object PartialFunctionIsBasicMethods extends App {
  //
  // Create partial function using abstract class
  // Methods: isDefinedAt, apply
  val f0: PartialFunction[Int, String] = new PartialFunction[Int, String] {
    override def isDefinedAt(x: Int): Boolean = x match {
      case 1 | 2 | 3 => true
      case _ => false
    }

    override def apply(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => throw new MatchError(x)
    }
  }

  println(f0(2))
  //println(f0(4))



  //
  // Method: applyOrElse
  val f1: PartialFunction[Int, String] = {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
  }

  println("f(2) =  " + (f1 applyOrElse(2, (x: Int) => "<undefined>")))
  println("f(4) =  " + (f1 applyOrElse(4, (x: Int) => "<undefined>")))

  val default1 = (x :Int) => "<undefined>"
  println("f(2) =  " + (f1 applyOrElse(2, default1)))
  println("f(4) =  " + (f1 applyOrElse(4, default1)))

  val g1 = (x: Int) => f1 applyOrElse(x, default1)
  println("f(2) =  " + g1(2))
  println("f(4) =  " + g1(4))
}
