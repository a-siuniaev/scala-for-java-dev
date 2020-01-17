package section6.lesson49

//Different ways to define Cartesian product of 2 sets
object CartesianProductDemo extends App {
  // for = imperative Java style
  def prod0[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    var result = Set[(A, B)]()
    for (elem0 <- set0) {
      for (elem1 <- set1) {
        result = result + ((elem0, elem1))
      }
    }
    result
  }

  // double for = imperative Scala style
  def prod1[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    var result = Set[(A, B)]()
    for (elem0 <- set0; elem1 <- set1) {
      result = result + ((elem0, elem1))
    }
    result
  }

  // for + yeild = for-comprehensions
  def prod2[A, B](set0: Set[A], set1: Set[B]): Set[(A, B)] = {
    for (elem0 <- set0; elem1 <- set1) yield (elem0, elem1)
  }

  //map + flatMap
  def prod3[A, B](set0: Set[A], set1: Set[B]): Set[(A,B)] = {
    set0.flatMap(elem0 => set1.map(elem1 => (elem0, elem1)))
  }

  //demo
  val set0: Set[Char] = Set('A', 'B', 'C')
  val set1: Set[Int] = Set(0, 1)
  val resultSet: Set[(Char, Int)] = prod1(set0, set1)
  println(resultSet)
}
