object Fib extends App {
  def fib(n: Int): Int =
    n match {
      case n if n == 1 => 0
      case n if n == 2 => 1
      case n => fib(n - 1) + fib(n - 2)
    }

  println(fib(10)) // should be 34
}
