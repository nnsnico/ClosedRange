import OpenClosedRange.{LClosedROpenRange, LOpenRClosedRange}

object RangeMain extends App {
  val range: ClosedRange = new ClosedRange(3, 8)
  val range2: ClosedRange = new ClosedRange(4, 12)
  println("closed range: " + range.getLowerEndPoint)
  println("closed range: " + range.getHigherEndPoint)
  println("closed range: " + range.toString)
  println("closed range: " + range.contains(-1))
  println("closed range: " + range.equals(range2))

  val openRange = new OpenRange(3, 8)
  println("open range: " + openRange.toString)
  println("open range: " + openRange.contains(3))

  val lClosedROpenRange: LClosedROpenRange = new LClosedROpenRange(3, 8)
  val lOpenRClosedRange: LOpenRClosedRange = new LOpenRClosedRange(4, 5)
  println("left-closed right-open range: " + lClosedROpenRange.toString)
  println("left-open right-closed range: " + lOpenRClosedRange.toString)
  println(s"closed range: ${range.isConnectedTo(range2)}")

  println(s"closed range containsAll: ${range.containAll(List(6, -1))}")
  println(s"closed range getIntersection: ${range.getIntersection(range2)}")
  println(s"new closed range: ${range.parse("[3,8]")}")
}
