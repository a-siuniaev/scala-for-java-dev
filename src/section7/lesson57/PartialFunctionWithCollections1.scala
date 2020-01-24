package section7.lesson57

object PartialFunctionWithCollections1 extends App {
  case class Person(name: String, age: Int)

  val people = List(Person("Mike", 45), Person("Sara", 12))

  val adult0 = people filter {p => p.age >= 18}
  val adult1 = people filter {_.age >= 18}
  val adult2 = people filter {case Person(_, age) => age >= 18}

  // this is true partially defined function - we'll get MatchError on Sara
  //val adult3 = people filter {case Person(_, age) if age > 18 => true}

  println(adult1)
}
