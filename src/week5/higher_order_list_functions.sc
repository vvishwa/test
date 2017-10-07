def scaleList(xs:List[Double], factor:Double): List[Double] = xs match {
  case Nil => xs
  case y::ys => y*factor :: scaleList(ys, factor)
}

scaleList(List(1,2,3,4), 4)

def squareList(xs: List[Int]): List[Int] = xs match {
  case Nil => Nil
  case y::ys => y*y :: squareList(ys)
}

squareList(List(1,2,3,4))

def squareList1(xs:List[Int]): List[Int] =
  xs map (x => x*x)

squareList1(List(1,2,3,4))

def posElems(xs: List[Int]): List[Int] = xs match {
  case Nil => xs
  case y :: ys => if (y > 0) y::posElems(ys) else posElems(ys)
}

posElems(List(-2,3,4,-6,2))

val data = List("a", "a", "a", "b", "c", "c", "a")

def pack[T](xs:List[T]): List[List[T]] = xs match {
  case Nil => Nil
  case x :: xs1 =>
    val(first, rest) = xs span(y => y == x)
    first :: pack(rest)
}

pack(data)

def encode[T](xs: List[T]): List[(T, Int)] =
  pack(xs) map (ys=> (ys.head, ys.length))

pack(data)
