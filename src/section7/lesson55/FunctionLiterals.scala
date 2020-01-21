package section7.lesson55

object FunctionLiterals {
  // Literals
  val x0: Int = 1
  val y0: String = "Hello"
  val z0: String => Int = (s: String) => s.length

  // Same literals with type inference
  val x1 = 1
  val y1 = "Hello"
  val z1 = (s: String) => s.length

  // Functional literal with types at BOTH sides
  val f0: Int => Int = (x: Int) => (x + 1): Int

  // Functional literal with types on RIGHT side
  val f1 = (x: Int) => x + 1
  val f2 = (_: Int) + 1

  // Functional literals with type on LEFT side
  val f3: Int => Int = x => x + 1
  val f4: Int => Int = _ + 1
  // You can have _ only if we use argument once
  // val f5: Int => Int = _ * _
  // But if we have multiple arguments, we can have multiple _
  val f5: (Int, Int) => Int = _ * _

  // You should have types on at least one side
  // val f6 = x => x + 1
  // val f7 = _ + 1

  // OO-style functions
  val f6: Function1[Int, Int] = (x: Int) => x + 1

  val f7: Function1[Int, Int] = new Function1[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }

  // Function is scala.predef synonym for Function1
  val f8: Function[Int, Int] = new Function1[Int, Int] {
    override def apply(x: Int): Int = x+ 1
  }
}
