package section7.lesson58

object EtaExpansionIntro1 extends App {
  def m(x: Int): Int = x + 1   // mapper/transform
  def p(x: Int): Boolean = x > 0   // predicate
  def set(f: Int => Int) = ???   // consumer of Functional Value

  // Explicit eta-expansion
  val f0: (Int => Int) = m
  val f1 = m _

  // Implicit eta-expansion
  set(m)
  val list0 = List(0, 1, 2, 3) filter p map m   // (2, 3, 4)
  // de-sugarized variant
  val list1: List[Int] = List(0, 1, 2, 3).filter(p).map(m)   // (2, 3, 4)
}
