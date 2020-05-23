class Person(var firstName: String, var lastName: String) {
  def printFullName() = println(s"$firstName $lastName")
}

val p = new Person("Siva", "Talluri")
println(p.firstName)
println(p.lastName)
p.printFullName()

def sum(a: Int, b: Int): Int =a + b
val x=sum(1,2)

def concatenate1(s1: String, s2: String)= s1+s2
val y =concatenate1("Siva","Talluri")



















