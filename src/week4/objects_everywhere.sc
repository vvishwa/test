package idealized.scala

abstract class Boolean {

  def ifThenElse[T](t: => T, e: =>T):T
  def && (x: =>Boolean): Boolean = ifThenElse(x, false)
  def || (x: =>Boolean): Boolean = ifThenElse(true, x)
  def uranary_!: Boolean = ifThenElse(false, true)

  def ==(x:Boolean): Boolean = ifThenElse(x, x.uranary_!)
  def =! (x:Boolean): Boolean = ifThenElse(x.uranary_!, x)

}

object true extends Boolean {
  def ifThenElse[T](t: => T, e: =>T) = e
}