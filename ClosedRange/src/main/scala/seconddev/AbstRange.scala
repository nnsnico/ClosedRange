package seconddev

abstract class AbstRange(low: Int, high: Int) {
  require(low < high)

  def getLowerEndPoint: Int = low

  def getHigherEndPoint: Int = high

  def getIntersection(range: AbstRange): AbstRange

  def contains(base: Int): Boolean = if (low <= base && high >= base) true else false

  def containAll(list: List[Int]): Boolean = list.forall(Range(low, high + 1).contains)

  def equals(range: AbstRange): Boolean = if (range.low == low && range.high == high) true else false

  def isConnectedTo(range: AbstRange): Boolean = {
    if (contains(range.low) || contains(range.high) || (!contains(range.low) && !contains(range.high))) true else false
  }

  def parse(s: String): AbstRange
}
