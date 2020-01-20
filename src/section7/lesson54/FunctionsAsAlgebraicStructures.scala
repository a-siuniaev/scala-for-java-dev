package section7.lesson54

object FunctionsAsAlgebraicStructures {
  import Lib._

  val f: Int => Int = x => x + 1
  val g: Int => Int = x => x * 2
  val h: Int => Int = x => x / 2

  // non-commutative:                f * g != g * f
  val n = f * g // x => (x * 2) + 1
  val m = g * f // x => (x + 1) * 2

  // associativity == SEMIGROUP:     (f * g) * h == f * (g * h)
  val a = (h * g) * f
  val b = h * (g * f)

  // + neutral element == MONOID:     exists 'e' for all 'f' such as e * f == f * e == f
  val e: Int => Int = x => x
  val x = f * e
  val y = e * f
}

object Lib {
  implicit class TmpWrapper(f: Int => Int) {
    def *(g: Int => Int): Int => Int = f compose g
  }
}
