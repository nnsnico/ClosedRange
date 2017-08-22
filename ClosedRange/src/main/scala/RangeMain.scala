import OpenClosedRange.{LClosedROpenRange, LOpenRClosedRange}

object RangeMain extends App {
  val range: ClosedRange = new ClosedRange(3, 8)
  val range2: ClosedRange = new ClosedRange(1, 4)
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
}
