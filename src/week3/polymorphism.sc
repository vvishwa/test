

trait IntList

//class Cons(val head:Int, val tail:IntList) extends IntList

//class Nil extends IntList

trait List[T] {
  def isEmpty: Boolean
  def head:T
  def tail: List[T]
}
class Cons[T](val head:T, val tail:List[T]) extends List[T] {
  def isEmpty = false
}
class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true
  override def head: Nothing = throw new NoSuchElementException("Nil.head")
  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])

singleton[Int](1)
singleton[Boolean](true)

object nth {
  def nth[T](n:Int, xs:List[T]): T =
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    else if (n == 0) xs.head
    else nth(n-1, xs.tail)

  val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
  nth(2, list)
  nth(-1, list)
}
