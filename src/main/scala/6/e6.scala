package e6

trait RNG {
  def nextInt: (Int, RNG)
}
