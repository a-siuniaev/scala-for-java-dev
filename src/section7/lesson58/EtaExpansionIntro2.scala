package section7.lesson58

object EtaExpansionIntro2 {

  def m(x: Int): Int = x + 1

  // Lambda Term (Lambda Calculus, Haskell) == Functional Literal (Scala)
  val f0: (Int => Int) = x => m(x)
  val f1 : (Int => Int) = m

  // in theory: f0 != f1
  // in practice: f0 == f1
}
