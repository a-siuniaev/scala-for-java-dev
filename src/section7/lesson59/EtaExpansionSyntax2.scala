package section7.lesson59

object EtaExpansionSyntax2 {
  def m(x: Int, y: Int) = x + y

  //val f0 = m   // Error: Missing argument for method m(Int)

  val f1: (Int, Int) => Int = m  // target-typing

  val f2 = m _   // partially-applied
  val f3 = m(_, _)   // partially-applied
}
