object GreatestCommonDivisor {

  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  gcd(21, 14)

}