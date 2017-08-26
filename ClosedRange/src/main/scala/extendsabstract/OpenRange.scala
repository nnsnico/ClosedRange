package extendsabstract

class OpenRange(low: Int, high: Int) extends AbstRange {
  require(low < high)

  override def getLowerEndPoint: Int = super.getLowerEndPoint

  override def getHigherEndPoint: Int = super.getHigherEndPoint

  override def getIntersection(range: AbstRange): AbstRange =
    new ClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

  override def parse(s: String): AbstRange = {
    val parsedValue = s.trim.tail.init.split(",")
    new OpenRange(parsedValue(0).toInt, parsedValue(1).toInt)
  }

  override def toString = s"($low,$high)"
}
