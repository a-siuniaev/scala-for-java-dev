package section6.lesson49

// Math: Ordered Pair or N-tuple ~ Scala: Tuple
object TupleDemo extends App {
    val x: (Int, String) = (0, "A")

    println(x._1)
    println(x._2)

    val y: (Int, String, (Long, Long), Boolean) = (0, "A", (1, 2), true)
    println(y._1)
    println(y._2)
    println(y._3)
    println(y._3._1)
    println(y._3._2)
    println(y._4)
}
