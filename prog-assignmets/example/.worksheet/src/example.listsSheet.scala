package example

object listsSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(312); 
  def sum(xs: List[Int]) = {
    val summed = 0
    def summation(summed: Int, xs: List[Int]): Int = {
      if (xs.isEmpty) summed
      else summation(plus(summed, xs), xs.tail)
    }
    def plus(summed: Int, xs: List[Int]) = summed + xs.head
    
    summation(0, xs)
  };System.out.println("""sum: (xs: List[Int])Int""");$skip(20); val res$0 = 

  sum(List(1,2,0));System.out.println("""res0: Int = """ + $show(res$0));$skip(335); 
  
  
  
  
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
  };System.out.println("""max: (xs: List[Int])Int""");$skip(21); val res$1 = 
  max(List(3, 7, 2));System.out.println("""res1: Int = """ + $show(res$1))}
}
