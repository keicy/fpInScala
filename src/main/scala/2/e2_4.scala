package e2_4

object Uncurry extends App {
  def uncuury[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }
}
