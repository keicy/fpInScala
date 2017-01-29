package e2_2

object Maine extends App {
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
}
