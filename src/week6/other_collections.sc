val xs = Array(1, 2, 3, 44)

xs map(x => x*2)

val s = "Hello World"
s filter (c => c.isUpper)

val r : Range = 1 until 5
val s1: Range = 1 to 5

val pairs = List(1,2,3) zip s
pairs.unzip

s flatMap (c => List('.', c))

xs.sum
xs.max

(1 to 9) flatMap(x => (1 to 20) map(y=>(x,y)))

def scalarProduct(xs: Vector[Double], ys: List[Double]):Double =
  (xs zip ys).map(xy => xy._1* xy._2).sum

def scalarProduct1(xs: Vector[Double], ys: List[Double]):Double =
  (xs zip ys).map { case (x,y) => x*y}.sum

def isPrime(n: Int): Boolean = (2 until n) forall(d => n%d !=0)
