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




