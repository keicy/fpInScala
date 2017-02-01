package e6

trait RNG {
  def nextInt: (Int, RNG) // 引数なし 副作用ないため()省略
}

case class SimpleRNG(seed: Long) extends RNG {
  def nextInt: (Int, RNG) = {
    val newSeed = (seed * 0x5DEECE66DL + 0xBL) & 0xFFFFFFFFFFFFL
    val nextRNG = SimpleRNG(newSeed)
    val n = (newSeed >>> 16).toInt
    (n, nextRNG)
  }

  // e6_1
  def nonNegativeInt(rng: RNG): (Int, RNG) = {
    def loop(rng: RNG): (Int, RNG) =
      rng.nextInt match {
        case (n, rng) if 0 <= n => (n, rng)
        case (n, rng) => loop (rng)
      }
    loop(rng)
  }

  def nonNegativeInt2(rng: RNG): (Int, RNG) = {
    val (i, g) = rng.nextInt
    (if(i < 0) -(i + 1) else i , g)
  }
}
