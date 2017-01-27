package e2_1

object Fib extends App {
  def fib1(n: Int): Int =
    n match {
      case n if n == 1 => 0
      case n if n == 2 => 1
      case n => fib1(n - 1) + fib1(n - 2)
    }
  println(fib1(10)) // should be 34

  def fib2(n: Int): Int = {
    def loop(n: Int, next: Int, it: Int): Int =
      if (n == 1) it
      else loop(n - 1, next + it, next)
    loop(n, 1, 0) //tailrec
  }
  println(fib2(10)) // should be 34
}
