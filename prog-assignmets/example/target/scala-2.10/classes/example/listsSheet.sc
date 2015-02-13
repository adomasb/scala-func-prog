package example

object listsSheet {
  def sum(xs: List[Int]) = {
    val summed = 0
    def summation(summed: Int, xs: List[Int]): Int = {
      if (xs.isEmpty) summed
      else summation(plus(summed, xs), xs.tail)
    }
    def plus(summed: Int, xs: List[Int]) = summed + xs.head
    
    summation(0, xs)
  }                                               //> sum: (xs: List[Int])Int

  sum(List(1,2,0))                                //> res0: Int = 3
  
  
  
  
  def max(xs: List[Int]) = {
  val maxValue = 0
  	def maximum(maxValue: Int, xs: List[Int]): Int = {
  		if (xs.isEmpty) maxValue
  		else maximum(compare(maxValue, xs), xs.tail)
  	}
  	def compare(maxValue: Int, xs: List[Int]) = {
  		if (maxValue >= xs.head) maxValue
  		else xs.head
  	}
  	maximum(maxValue, xs)
  }                                               //> max: (xs: List[Int])Int
  max(List(3, 7, 2))                              //> res1: Int = 7
}