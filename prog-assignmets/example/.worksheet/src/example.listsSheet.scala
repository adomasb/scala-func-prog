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
  };System.out.println("""sum: (xs: List[Int])Int""");$skip(26); val res$0 = 

  sum(List(-1, 3, 4, 5));System.out.println("""res0: Int = """ + $show(res$0))}
}
