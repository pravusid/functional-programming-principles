object TailRecursionSum {

  // a~b 범위(개구간)의 값을 f 함수로 계산하여 더한다
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a+1, acc + f(a))
    }

    loop(a, 0)
  }

  sum(x => x + x)(1, 2)

}
