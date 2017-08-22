class ClosedRange(val low: Int, val high: Int) {
  require(low < high)

  def getLowerEndPoint: Int = low

  def getHigherEndPoint: Int = high

  def contains(base: Int): Boolean = if (low <= base && high >= base) true else false

  def equals(range: ClosedRange): Boolean = if (range.low == low && range.high == high) true else false

  override def toString: String = s"[$low,$high]"
}