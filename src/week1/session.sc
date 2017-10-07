object session {
  1+2
  def sqrt(x:Double) = {
    def abs(x:Double) = if (x<0) -x else x

    def sqrtIter(guess:Double, x:Double):Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x),x )

    def isGoodEnough(guess: Double, x: Double):Boolean =
      abs(guess*guess - x )/x < 0.001

    def improve(guess: Double, x: Double):Double =
      (guess + x/guess)/2

    sqrtIter(1.0, x)
  }

  sqrt(2)
  sqrt(1e-6)
  sqrt(1e60)

  def sqrt1(x:Double) = {
    def abs(x:Double) = if (x<0) -x else x

    def sqrtIter(guess:Double):Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess) )

    def isGoodEnough(guess: Double, x: Double):Boolean =
      abs(guess*guess - x )/x < 0.001

    def improve(guess: Double):Double =
      (guess + x/guess)/2

    sqrtIter(1.0)
  }

  sqrt1(2)
  sqrt1(1e-6)
  sqrt1(1e60)

  def gcd(a:Int, b:Int): Int =
    if (b==0) a else gcd(b, a%b)

  gcd(14, 21)

  def factorial(n:Int): Int =
    if(n == 0) 1 else n*factorial(n-1)

  factorial(5)
}

