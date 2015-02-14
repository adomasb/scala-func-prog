def sum(xs: List[Int]) = {
  val summed = 0
  def summation(summed: Int, xs: List[Int]): Int = {
    if (xs.isEmpty) summed
    else summation(plus(summed, xs), xs.tail)
  }
  def plus(summed: Int, xs: List[Int]) = summed + xs.head

  summation(0, xs)
}

sum(List(1,2,3))

sum(List(1,2,0))