def factorial(i: Int):Int =
  if (i == 0)1 else i*factorial(i-1)

def sumInts(a:Int, b:Int) :Int =
  if (a>b) 0 else a + sumInts(a+1, b)

def cube(x: Int): Int = x*x*x

def sumCubes(a:Int, b:Int): Int =
  if (a > b) 0 else cube(a) + sumCubes(cube(a+1), b)

def sumFactorial(a:Int, b:Int): Int =
  if (a > b) 0 else factorial(a) + sumCubes(factorial(a+1), b)

def sum(f: Int => Int, a:Int, b:Int):Int =
  if (a>b) 0 else f(a)+sum(f, a+1, b)

def sumInts1(a:Int, b:Int): Int = sum(id, a, b)
def sumCubes1(f: Int=>Int, a:Int, b:Int): Int = sum(cube, a, b)
def sumFactorials(a: Int, b:Int): Int = sum(factorial, a, b)
def sumCubes2(a:Int, b:Int):Int = sum((x => x*x*x),a, b)

def id(x: Int) = x

def sum1(f:Int => Int, a:Int, b:Int):Int = {
  def loop(a:Int, acc:Int):Int = {
    if (a>b) acc
    else loop(a+1, f(a)+ acc)
  }
  loop(a, 0)
}
sum1(x => x*x,3 ,5)



