package recfun

object testing {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(770); 

  // row                              column
  //          0    1    2     3     4     5      6     7    8   9 10
  //      |---  --- ---   ---   ---   ---   ---   ---  --- --- ---
  //  0   |   1
  //  1   |   1   1
  //  2   |   1   2    1
  //  3   |   1   3    3     1
  //  4   |   1   4    6     4     1
  //  5   |   1   5  10   10     5     1
  //  6   |   1   6  15   20   15     6     1
  //  7   |   1   7  21   35   35   21     7     1
  //  8   |   1   8  28   56   70   56   28     8    1
  //  9   |   1   9  36   84 126 126   84   36    9    1
  // 10   |   1  10  45  120 210 252 210 120  45  10   1

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(15); val res$0 = 
  pascal(3, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  pascal(0, 2);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  pascal(1, 2);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  pascal(1, 3);System.out.println("""res3: Int = """ + $show(res$3));$skip(435); 

  def balance(chars: List[Char]) = {
    var state = 0
    def iter(charsList: List[Char], state: Int): Boolean = {
      if (charsList.isEmpty && state == 0) true
      else iter(charsList.tail, stateCondition(charsList, state))
    }
    def stateCondition(charsList: List[Char], state: Int) = {
      if (charsList.head == '(') state + 1
      if (charsList.head == ')') state - 1
      else state
    }
    iter(chars, state)
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(179); 
  
  
  def iter(charsList: List[Char], state: Int): Boolean = {
    if (charsList.isEmpty && state == 0) true
    else iter(charsList.tail, stateCondition(charsList, state))
  };System.out.println("""iter: (charsList: List[Char], state: Int)Boolean""");$skip(161); 
  def stateCondition(charsList: List[Char], state: Int) = {
    if (charsList.head == '(') state + 1
    if (charsList.head == ')') state - 1
    else state
  };System.out.println("""stateCondition: (charsList: List[Char], state: Int)Int""");$skip(51); val res$4 = 
  
  stateCondition("(just an) example".toList, 0);System.out.println("""res4: Int = """ + $show(res$4));$skip(41); val res$5 = 
  "(just an) example".toList.head == '(';System.out.println("""res5: Boolean = """ + $show(res$5))}
}
