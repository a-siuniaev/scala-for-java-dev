package section7.lesson57

object PartialFunctionWithCollections4 extends App {
  val f = Map("0" -> 0, "1" -> 1)

  // Different ways to get default String in case of undefined element using Map
  // 1 - pattern matching
  f.get("0") match {
    case Some(k) => println(k)
    case None => println("<undefined>")
  }

  // 2 - pattern matching inside println
  println(f.get("0") match {
    case Some(k) => k
    case None => "<undefined>"
  })

  // 3 - getOrElse in Option
  println(f.get("0").getOrElse("<undefined>"))

  //4 - getOrElse in Map
  println(f.getOrElse("0", "<undefined>"))
}
