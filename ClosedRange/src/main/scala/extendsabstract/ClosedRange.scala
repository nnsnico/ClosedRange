package extendsabstract

object ClosedRange {
  def parse(s: String): ClosedRange = {
    val parsed = s.trim.tail.init.split("[,\\s]+")
    println(parsed.toString)
    new ClosedRange(parsed(0).toInt, parsed(1).toInt)
  }

  class ClosedRange(low: Int, high: Int) extends AbstRange {
    require(low < high)

    override def getLowerEndPoint: Int = low

    override def getHigherEndPoint: Int = high

    override def getIntersection(range: AbstRange) =
      new ClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

    override def contains(base: Int): Boolean = if (low <= base && high >= base) true else false

    override def toString = s"[$low,$high]"
  }
}