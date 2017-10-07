34+65
def radius=10
def pi=3.14
radius*pi
2*pi*radius
def square(x:Double) = x*x
square(2)
square(5+4)
square(square(4))
def sumOfSquares(x:Double, y:Double) = square(x)+square(y)
def power(x:Double, y:Int) :Double = ???

def loop:Int = loop

//loop //goes to infinite

def first(x:Int, y:Int) = x

// first(2, loop) //loops forever as it is call by value

def constOne(x:Int, y: => Int) = 1

constOne(1+2, loop) // doesn't loop as second argument is call by name

// constOne(loop, 1+2) // loop because first argument is call by value

def abs(x:Int) = if(x>0) true else false


//val x = 2
//val y = square(2)

def x = loop // def makes right function call by name

//val x = loop  //val makes right function call by value which loops in this case

def and(x:Boolean, y: => Boolean) = if (x) y else false
and(true, false)
and(true, true)
def loop1:Boolean = loop1
and(false, loop1) // works because second argument is by name







