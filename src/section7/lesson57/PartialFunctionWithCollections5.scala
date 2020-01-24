package section7.lesson57

object PartialFunctionWithCollections5 extends App {
  // List and Sequence as PartialFunction
  val f1: PartialFunction[Int, String] = Seq("0", "1", "2")
  val f2: Int => String = Seq("0", "1", "2")

  val g1: PartialFunction[Int, String] = List("0", "1", "2")
  val g2: Int => String = List("0", "1", "2")
}
