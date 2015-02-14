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
balance("())(".toList)