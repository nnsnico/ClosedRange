package seconddev

class ClosedRange(low: Int, high: Int) extends AbstRange(low, high) {
  override def getLowerEndPoint: Int = super.getLowerEndPoint

  override def getHigherEndPoint: Int = super.getHigherEndPoint

  override def getIntersection(range: AbstRange) =
    new ClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

  override def contains(base: Int): Boolean = super.contains(base)

  override def containAll(list: List[Int]): Boolean = super.containAll(list)

  override def equals(range: AbstRange): Boolean = super.equals(range)

  override def isConnectedTo(range: AbstRange): Boolean = super.isConnectedTo(range)

  override def parse(s: String): AbstRange = {
    val firstParse = s.trim.tail.init
    val secondParse = firstParse.split(",")
    new ClosedRange(secondParse(0).toInt, secondParse(1).toInt)
  }

  override def toString = s"[$low,$high]"
}
