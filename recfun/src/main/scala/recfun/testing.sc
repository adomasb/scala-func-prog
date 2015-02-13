package recfun

object testing {

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
  }                                               //> pascal: (c: Int, r: Int)Int
  pascal(3, 4)                                    //> res0: Int = 4
  pascal(0, 2)                                    //> res1: Int = 1
  pascal(1, 2)                                    //> res2: Int = 2
  pascal(1, 3)                                    //> res3: Int = 3

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
  }                                               //> balance: (chars: List[Char])Boolean
  
  
  def iter(charsList: List[Char], state: Int): Boolean = {
    if (charsList.isEmpty && state == 0) true
    else iter(charsList.tail, stateCondition(charsList, state))
  }                                               //> iter: (charsList: List[Char], state: Int)Boolean
  def stateCondition(charsList: List[Char], state: Int) = {
    if (charsList.head == '(') state + 1
    if (charsList.head == ')') state - 1
    else state
  }                                               //> stateCondition: (charsList: List[Char], state: Int)Int
  
  stateCondition("(just an) example".toList, 0)   //> res4: Int = 0
  "(just an) example".toList.head == '('          //> res5: Boolean = true
}