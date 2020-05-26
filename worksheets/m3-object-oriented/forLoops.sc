val nums= Seq(1,2,3)
for (n <- nums) println(n)
val people = List(
  "Bill",
  "Candy",
  "Karen",
  "Leo",
  "Regina"
)

for (p <- people) println(p)
println("new print")
people.foreach(println)
val ratings = Map(
  "lady in the Water" -> 3.0,
  "Snakes on a Plane" -> 4.0,
  "You, Me and Dupree" ->3.5
)

for ((name,rating) <- ratings ) println(s"Movie: $name, Rating: $rating")

ratings.foreach {
  case(movie, rating) => println(s"Key: $movie, value: $rating")
    }

val nums= Seq(1,2,3)

val doubleNums = for (n<- nums) yield n*2

val names = List("adam", "david", "frank")
val ucNames = for (name <- names) yield name.capitalize

val names = List("_adam", "_david", "_frank")

val capNames = for (name <- names) yield {
  val nameWithoutUnderscore = name.drop(1)
  val capName = nameWithoutUnderscore.capitalize
  capName
}

val names1 = List("_adam", "_david", "_frank")
val capNames = for (name <- names1) yield name.drop(1).capitalize
















