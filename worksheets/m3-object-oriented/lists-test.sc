val nums =List.range(0,11)
val nums =(1 to 10 by 3).toList
val letters =('a' to 'f').toList
val letters =('a' to 'f' by 2).toList

val nums = (1 to 10).toList
val names = List("siva","rama","prasad","talluri")
names.foreach(println)
nums.filter(_<18).foreach(println)
val doubles = nums.map(_*2)
val capNames = names.map(_.capitalize)
val lessThanFive = nums.map(_ <6)

nums.foldLeft(5)(_+_)
nums.foldLeft(1)(_*_)
class Person(var name: String)

val t = (11, "Eleven", new Person("Eleven"))
t._1
t._2
t._3
val (num,string,person) = (11,"Eleven", new Person("Eleven"))

val x = new Person("Siva")
x.name
"hello".head
"hello".tail
"hello, world".take(5)
println("hi")
1+2*2

var a ='a'
a ='b'
println(a)

val firstName = "Siva"
val mi = "RP"
val lastName = "Talluri"
val name = firstName + " " + mi + " " + lastName
val name1 = s"$firstName $mi $lastName"
println(s"MyName: $firstName $mi $lastName")

val speech = """Four score and
              |seven years ago
              |our fathers ...""".stripMargin














































