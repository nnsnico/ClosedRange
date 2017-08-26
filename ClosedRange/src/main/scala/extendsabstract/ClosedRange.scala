package extendsabstract

class ClosedRange(low: Int, high: Int) extends AbstRange {
  override def getLowerEndPoint: Int = low

  override def getHigherEndPoint: Int = high

  override def getIntersection(range: AbstRange) =
    new ClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

  override def parse(s: String): AbstRange = {
    val parsedValue = s.trim.tail.init.split(",")
    new ClosedRange(parsedValue(0).toInt, parsedValue(1).toInt)
  }

  override def toString = s"[$low,$high]"
}
