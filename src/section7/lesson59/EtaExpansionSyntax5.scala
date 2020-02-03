package section7.lesson59

object EtaExpansionSyntax5 {
  // parameterless method
  def m: Int = 0

  val f0 = m   // OK: method call
  val f1: Int = m   // OK: method call

  val f2 = m()   // Error: m cannot be called with braces
  val f3: Int = m()   // Error: m cannot be called with braces

  val f4: () => Int = m   // Error: m does not have type () => Int

  val f5 = m _   // OK: eta-expansion + partially applied
  val f6 = m(_)   // Error: m cannot be called with braces or argument
}
