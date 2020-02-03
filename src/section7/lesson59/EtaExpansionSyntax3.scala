package section7.lesson59

object EtaExpansionSyntax3 {
  def m(x: Int) = x + 1
  def m(x: Int, y: Int) = x+ y

  //val f0 = m   // Error: cannot resolve symbol 'm'
  val f1: Int => Int = m   // target typing
  val f2: (Int, Int) => Int = m   // target typing

  //val f2 = m _   // Error: cannot resolve symbol 'm'
  //val f3 = m(_, _)   // Error: missing parameter type for expanded function
  //val f4 = m(_)  // Error: missing parameter type for expanded function

  val f5 = m(_: Int, _: Int)    // partially-applied
  val f6 = m(_: Int)    // partially-applied


}