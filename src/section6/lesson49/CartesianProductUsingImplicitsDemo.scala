package section6.lesson49

// define * operator on sets using implicit wrapper = math style
object Lib {
  implicit class SetWrapper[A](set0: Set[A]) {
    def *[B](set1: Set[B]): Set[(A, B)] =
      for (elem0 <- set0; elem1 <- set1) yield (elem0, elem1)
  }
}

object CartesianProductUsingImplicitsDemo {
  import Lib._

  val set0: Set[Char] = Set('A', 'B', 'C')
  val set1: Set[Int] = Set(0, 1)
  val resultSet: Set[(Char, Int)] = set0 * set1
  println(resultSet)
}
