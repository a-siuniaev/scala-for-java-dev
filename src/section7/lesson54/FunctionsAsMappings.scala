package section7.lesson54

object FunctionsAsMappings extends App {
  // country -> capital
  // class Map[A, B] extends (A => B)
  val f: String => String =
    Map("France" -> "Paris", "Japan" -> "Tokyo", "Norway" -> "Oslo")

  // city -> population
  // partially defined function
  val g: String => Int = {
    case "Paris" => 5
    case "Tokyo" => 15
    case "Oslo" => 1
  }

  // country -> capital population
  val h: String => Int = g compose f

  println(h("France"))
}
