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


object List {
  def apply[T](x: T): List[T] = new Cons(x, new Nil)
  def apply[T](x1: T, x2:T): List[T] = new Cons(x1, new Cons(x2, new Nil))
  def apply[T]() = new Nil
}

List()
List(1)
List(2,3)
List(1,2,3)
