import math.abs

// 2.1

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a+1, f(a)+acc)
  }
  loop(a, 0)
}

sum(x => x*x, 1, 5)

// 2.2

def product(f: Int => Int)(a: Int, b: Int): Int = {
  if (a > b) 1
  else f(a)*product(f)(a+1, b)
}

product(x => x*x)(3, 4)
def factorial(n: Int) = product(x => x)(1, n)
factorial(5)

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
  if (a > b) zero
  else combine(f(a), mapReduce(f, combine, zero)(a+1, b))
}

// 2.3

val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) =
  abs((x-y)/x)/x < tolerance

def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}

def averageDamp(f: Double => Double)(x: Double) = (x + f(x))/2

def sqrt(x: Double) =
  fixedPoint(averageDamp(y => x/y))(1)

sqrt(2)

// 2.5

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a%b)
  def numer = x
  def denom = y

  def +(that: Rational) = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )}

  override def toString = {
    val g = gcd(numer, denom)
    numer/g + "/" + denom/g
  }

  def < (that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this
  def unary_- : Rational = new Rational(-numer, denom)
  def -(that: Rational) = this + -that

}
val x = new Rational(1, 2)
val y = new Rational(5, 7)
val z = new Rational(3, 2)
x - y - z
x < y
x max z