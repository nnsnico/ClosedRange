package extendsabstract

object OpenRange {
  def parse(s: String): OpenRange = {
    val parsed = s.trim.tail.init.split("[,\\s]+")
    new OpenRange(parsed(0).toInt, parsed(1).toInt)
  }

  class OpenRange(low: Int, high: Int) extends AbstRange {
    require(low < high)

    override def getLowerEndPoint: Int = low

    override def getHigherEndPoint: Int = high

    override def getIntersection(range: AbstRange): AbstRange =
      new OpenRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

    override def contains(base: Int): Boolean = if (low < base && high > base) true else false

    override def toString = s"($low,$high)"
  }
}