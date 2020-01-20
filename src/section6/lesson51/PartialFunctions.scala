package section6.lesson51

object PartialFunctions extends App {
  val f: PartialFunction[String, Int] = {
    case "0" => 0
    case "1" => 1
  }

  // Map has PartialFunction trait
  val g: PartialFunction[String, Int] =
    Map("0" -> 0, "1" -> 1)
}
