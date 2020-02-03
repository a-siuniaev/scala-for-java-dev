package section7.lesson59

object EtaExpansionSyntax1 {
  def m(x: Int) = x + 1

  //val f = m   // Error: Missing argument for method m(Int)

  val f1: Int => Int = m   // target-typing

  val f2 = m _   // partially-applied
  val f3 = m(_)   // partially-applied
}
