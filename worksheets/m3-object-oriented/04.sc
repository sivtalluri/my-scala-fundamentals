class Employee(val first: String, val last: String)
{
  override  def toString: String = first + " " + last
  }
val bobMartin = new Employee("Bob", "Martin")
bobMartin

bobMartin.first
bobMartin.last

class Color(val value: String) //public val field
val c = new Color( value= "red")
c.value

class Shape(var Value: String)  // public var field
val s = new Shape (Value= "circle")
s.Value
s.Value = "square"
s.Value








