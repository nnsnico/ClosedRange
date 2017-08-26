package extendsabstract

object OpenClosedRange {
  class LClosedROpenRange(low: Int, high: Int) extends AbstRange {
    override def getLowerEndPoint: Int = low

    override def getHigherEndPoint: Int = high

    override def getIntersection(range: AbstRange): AbstRange =
      new LClosedROpenRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

    override def parse(s: String): AbstRange = {
      val parsedValue = s.trim.tail.init.split(",")
      new LClosedROpenRange(parsedValue(0).toInt, parsedValue(1).toInt)
    }
  }

  class LOpenRClosedRange(low: Int, high: Int) extends AbstRange {
    override def getLowerEndPoint: Int = low

    override def getHigherEndPoint: Int = high

    override def getIntersection(range: AbstRange): AbstRange =
      new LClosedROpenRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

    override def parse(s: String): AbstRange = {
      val parsedValue = s.trim.tail.init
      new LOpenRClosedRange(parsedValue(0).toInt, parsedValue(1).toInt)
    }
  }
}
