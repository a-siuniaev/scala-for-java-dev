package section6.lesson49

//predicative form of Binary Relation
object BinaryRelation extends App {
  val lt: (Int, Int) => Boolean = _ < _      // less than
  val le: (Int, Int) => Boolean = _ <= _     // less or equal
  val eq: (Int, Int) => Boolean = _ == _     // equal
  val dc: (Int, Int) => Boolean = _%_ == 0   // div

  // generates tables for relation for given range
  def showRelation(range: Range, rel: (Int, Int) => Boolean) = {
    for (i <- range) {
      for (j <- range) {
        print(if (rel(i,j)) " +" else " -")
      }
      println()
    }
  }

  println("Less relation")
  showRelation(1 to 4, lt)
}
