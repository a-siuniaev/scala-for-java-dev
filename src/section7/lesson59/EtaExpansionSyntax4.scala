package section7.lesson59

object EtaExpansionSyntax4 {
  val f0 = println   // crazy style: call and save 'Unit'
  val f1: Unit = println   // crazy style: call and save 'Unit'
  val f2: Unit = println()   // Ok (but do you really need Unit instance?)

  //val f3 = println _   // Cannot resolve overloaded 'println' method
  val f5: () => Unit = println   // target typing
  val f6: Int => Unit = println   // target typing
}
