package section6.lesson51

object Functions {
  // + totally defined
  // + injective
  // - surjective
  // - bijective
  val toS: Int => String =
    k => "" + k

  // - totally defined
  // + injective
  // + surjective
  // - bijective
  val toI: String => Int =
    s => s.toInt
}
