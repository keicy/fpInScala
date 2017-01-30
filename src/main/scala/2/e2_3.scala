package e2_3

object Curry extends App {
  def curry[A, B, C](f: (A, B) => C) : A => (B => C) = {
    (a: A) => f(a, (_: B))
  }
}
