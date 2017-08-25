package firstdev

class ClosedRange(val low: Int, val high: Int) {
  require(low < high)

  def getLowerEndPoint: Int = low

  def getHigherEndPoint: Int = high

  def getIntersection(range: ClosedRange): ClosedRange = new ClosedRange(low max range.low, high min range.high)

  def contains(base: Int): Boolean = if (low <= base && high >= base) true else false

  def containAll(list: List[Int]): Boolean = list.forall(Range(low, high + 1).contains)

  def equals(range: ClosedRange): Boolean = if (range.low == low && range.high == high) true else false

  def isConnectedTo(range: ClosedRange): Boolean = {
    if (contains(range.low) || contains(range.high) || (!contains(range.low) && !contains(range.high))) true else false
  }

  def parse(s: String): ClosedRange = {
    val firstParse = s.tail.init
    val secondParse = firstParse.split(",")
    new ClosedRange(secondParse(0).toInt, secondParse(1).toInt)
  }

  override def toString: String = s"[$low,$high]"
}