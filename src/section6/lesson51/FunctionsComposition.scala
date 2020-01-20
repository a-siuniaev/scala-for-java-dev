package section6.lesson51

import java.util

object FunctionsComposition extends App{
  // 123 => "123
  val f: Int => String =
    k => k.toString

  // "123" => ['1', '2', '3']
  val g: String => Array[Char] =
    s => s.toCharArray

  // 123 => ['1', '2', '3']
  val h0: Int => Array[Char] =
    g compose f

  // 123 => ['1', '2', '3']
  val h1: Int => Array[Char] =
    f andThen g

  //demo
  println(util.Arrays.toString(h0(123)))
  println(util.Arrays.toString(h1(123)))
}
