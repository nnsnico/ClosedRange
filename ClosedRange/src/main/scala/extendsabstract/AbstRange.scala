package extendsabstract

abstract class AbstRange {
  def getLowerEndPoint: Int

  def getHigherEndPoint: Int

  def getIntersection(range: AbstRange): AbstRange

  def contains(base: Int): Boolean =
    if (getLowerEndPoint <= base && getHigherEndPoint >= base) true else false

  def containAll(list: List[Int]): Boolean =
    list.forall(Range(getLowerEndPoint, getHigherEndPoint + 1).contains)

  def equals(range: AbstRange): Boolean =
    if (range.getLowerEndPoint == getLowerEndPoint &&
      range.getHigherEndPoint == getHigherEndPoint) true else false

  def isConnectedTo(range: AbstRange): Boolean = {
    if (contains(range.getLowerEndPoint) || contains(range.getHigherEndPoint) ||
      (!contains(range.getLowerEndPoint) && !contains(range.getHigherEndPoint))) true else false
  }

  def parse(s: String): AbstRange
}