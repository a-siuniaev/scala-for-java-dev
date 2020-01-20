package section7.lesson54

// Scala is hybrid OO-Functional language
//
// This means the following
// 1. Scala = OO-Kernel + syntax sugar for emulating Functional Language
// 2. Scala = Object-Oriented + Functional Language
object ScalaAsHybridLanguage {
  // Functional style
  val f0: Int => Int = 2 * _

  // OO Style
  val f1: Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(x: Int): Int = 2 * x
  }

  // functional style of curring
  val curry0: ((Int, Int) => Int) => (Int => (Int => Int)) =
    f => x => y => f(x, y)

  // OO-style of curring
  val curry1: Function1[Function1[(Int, Int), Int], Function1[Int, Function1[Int, Int]]] =
    new Function1[Function1[(Int, Int), Int], Function1[Int, Function1[Int, Int]]] {
      override def apply(f: Function1[(Int, Int), Int]): Function1[Int, Function1[Int, Int]] =
        new Function1[Int, Function1[Int, Int]] {
          override def apply(x: Int): Function1[Int, Int] =
            new Function1[Int, Int] {
              override def apply(y: Int): Int = f(x,y)
            }
        }
    }
}
