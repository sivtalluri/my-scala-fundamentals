/**
  * m3-object-oriented -> 05.sc
*/

class Employee(f: String, l: String, s: Int) {
  private val first: String =f
  private val last: String =l
  private var stocks: Int =s

  def getFirst : String = first
  def getLast : String = last
  def getStocks : Int =stocks

  def awardMoreStocks(numberOfStocks: Int): Unit = stocks += numberOfStocks
  /** method return type is "Unit" means there is no return value.
   * this is also called procedure.in awardMoreStocks method it will add the value to stocks,
   * so it will be assigned back to getStocks method.  */
  override def toString: String = first + " " + last + " " + stocks
}
val bobMartin = new Employee("Bob", "Martin", 10)
bobMartin.getFirst
bobMartin.getLast
bobMartin.getStocks
bobMartin.awardMoreStocks(15)
bobMartin.getStocks
bobMartin.awardMoreStocks(10)
bobMartin.getStocks


