package firstdev

class OpenRange(low: Int, high: Int) extends ClosedRange(low, high) {
  require(low < high)

  override def getLowerEndPoint: Int = super.getLowerEndPoint

  override def getHigherEndPoint: Int = super.getHigherEndPoint

  override def toString: String = s"($low,$high)"

  override def contains(base: Int): Boolean = if (low < base && high > base) true else false

  def equals(range: OpenRange): Boolean = if (range.low == low && range.high == high) true else false
}