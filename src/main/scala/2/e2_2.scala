package e2_2

object IsSorted extends App {
  def isSorted[A](as: Array[A], orderd: (A,A) => Boolean): Boolean = {
    def loop(xs: Array[A]): Boolean = {
      xs match {
        case Array() => true
        case Array(_) => true
        case Array(a,b,_*) => orderd(a, b) && loop(xs.tail)
      }
    }
    loop(as)
  }

  println(isSorted(Array(1,2,3,4,5), (_: Int) <= (_: Int)))
  println(isSorted(Array(1,2), (_: Int) <= (_: Int)))
  println(isSorted(Array(2,1), (_: Int) <= (_: Int)))
  println(isSorted(Array(), (_: Int) <= (_: Int)))
  println(isSorted(Array(1), (_: Int) <= (_: Int)))
  println(isSorted(Array("China", "America", "Brazil"), (_: String) <= (_: String)))
}
