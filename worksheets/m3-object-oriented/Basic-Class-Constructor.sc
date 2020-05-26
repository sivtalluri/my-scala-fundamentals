class Person(var firstName: String, var lastName: String)
val p= new Person("Bill", "Panner")
println(p.firstName +" " +p.lastName)

class Person(var firstName: String, var lastName: String) {
  def getFirstName = this.firstName

  def setFirstName(firstName: String): Unit = {
    this.firstName = firstName
  }

  def getLastName = this.lastName

  def setLastName(lastName: String): Unit = {
    this.lastName = lastName
  }
}

val p = new Person("Kim","Carnes")
println(p.firstName)
println (p.lastName)

def addThenDouble(a: Int, b: Int): Int = {
  val sum = a + b
  val doubled = sum * 2
  doubled
}


println(addThenDouble(1,1))
















