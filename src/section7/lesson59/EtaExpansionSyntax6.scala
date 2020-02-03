package section7.lesson59

object EtaExpansionSyntax6 {
  // zero parameters method
  def m(): Int = 0

  val f0 = m   // Bad style: method call
  val f1: Int = m   // Bad style: method call

  val f2 = m()   // OK: method call
  val f3: Int = m()   // OK: mathod call

  val f4: () => Int = m   // Ok: eta expansion + target typing

  val f5 = m _   // OK: eta-expansion + partially applied
  val f6 = m(_)   // Error: m cannot be called with argument
}
