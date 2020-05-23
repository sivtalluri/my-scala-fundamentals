import java.io.FileNotFoundException

val x: Int =1
val s: String = "a string"

val x =if(5<4) 5 else 4
val x= if(10>7) true else false

val result = 1 match {
  case 1 => "one"
  case 2 => "two"
  case _ => "not 1 or 2"
}

for (i <- -1 to 5) println(i)

for (i <- 0 to 10 by 2) println(i)

val x = for (i <- -1 to 5) yield i*2

val fruits = List("apple", "banana", "lime", "orange")
val fruitLengths = for {
  f <- fruits
  if f.length > 3
}   yield f


























































