package section7.lesson54

object FunctionsAsAlgorithms {
  // imperativ, mutate memory definition
  def checksum(s: String): Int = {
    var acc = 0
    for (c <- s) {
      acc = acc + c
    }
    return acc
  }

  //recursive algorithm
  def checkSum1(s: String): Int = {
    if (s.isEmpty)
      return 0
    else
      s.head + checkSum1(s.tail)
  }
}
