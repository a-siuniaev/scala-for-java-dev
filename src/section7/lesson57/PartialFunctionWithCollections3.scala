package section7.lesson57

object PartialFunctionWithCollections3 extends App {
  // Map collection is a PartialFunction
  val f: Map[Int, String] =
    Map(1 -> "one", 2 -> "two", 3 -> "three")

  val g: Int => String =
    Map(1 -> "one", 2 -> "two", 3 -> "three")

  val h: PartialFunction[Int, String] =
    Map(1 -> "one", 2 -> "two", 3 -> "three")



  //
  // So we can use Map to collect in List
  println(List(0, 1, 2) collect Map(1 -> "one", 2 -> "two", 3 -> "three"))



  //
  // We can "compose" Maps. But compose will return function (not Map)
  val f1 = Map("A" -> 0, "B" -> 1, "C" -> 2)
  val g1 = Map(0 -> 100, 1 -> 200, 2 -> 300)
  println((g1 compose f1) ("B"))


  //
  // runWith, isDefinedAt
  val f2 = Map("0" -> 0, "1" -> 1)
  if (f2.isDefinedAt("0")) {
    println(f2("0"))
  }
  f2.runWith(println)("0")



  //
  // get method returns Option[A] and we can use foreach on Option
  val value: Option[Int] = f2.get("0")
  value.foreach(println)
}
