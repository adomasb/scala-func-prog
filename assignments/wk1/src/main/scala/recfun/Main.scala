package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]) = {

    def balancer(chars: List[Char], state: Int): Boolean = {
      if (state < 0) false
      else if (chars.isEmpty) true
      else balancer(chars.tail, changeState(chars.head.toString, state))
    }
    def changeState(char: String, state: Int) = {
      if (char == "(") state+1
      else if (char == ")") state-1
      else state
    }

    balancer(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else countChange(money, coins.tail) + countChange(money-coins.head, coins)
  }
}
