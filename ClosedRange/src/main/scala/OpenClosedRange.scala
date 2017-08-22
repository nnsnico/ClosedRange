object OpenClosedRange {
  class LClosedROpenRange(low: Int, high: Int) extends ClosedRange(low, high) {
    require(low < high)

    override def getLowerEndPoint: Int = super.getLowerEndPoint

    override def getHigherEndPoint: Int = super.getHigherEndPoint

    override def contains(base: Int): Boolean = if (low <= base && high > base) true else false

    def equals(range: LClosedROpenRange): Boolean = super.equals(range)

    override def toString: String = s"[$low,$high)"
  }

  class LOpenRClosedRange(low: Int, high: Int) extends ClosedRange(low, high) {
    require(low < high)

    override def getLowerEndPoint: Int = super.getLowerEndPoint

    override def getHigherEndPoint: Int = super.getHigherEndPoint

    override def contains(base: Int): Boolean = if (low < base && high >= base) true else false

    def equals(range: LOpenRClosedRange): Boolean = super.equals(range)

    override def toString: String = s"($low,$high]"
  }
}
