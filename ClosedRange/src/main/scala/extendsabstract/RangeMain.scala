package extendsabstract

import extendsabstract.ClosedRange.ClosedRange
import extendsabstract.OpenClosedRange.LClosedROpenRange.LClosedROpenRange
import extendsabstract.OpenClosedRange.LOpenRClosedRange.LOpenRClosedRange
import extendsabstract.OpenClosedRange.LOpenRClosedRange
import extendsabstract.OpenRange.OpenRange

object RangeMain extends App {
  val cRange: ClosedRange = new ClosedRange(3, 8)
  println(
    s"""ClosedRange: ${cRange.toString}
       |           : low = ${cRange.getLowerEndPoint}
       |           : high = ${cRange.getHigherEndPoint}
       |           : contains(4) = ${cRange.contains(4)}
     """.stripMargin)
  val oRange: OpenRange = new OpenRange(3, 8)
  println(
    s"""OpenRange: ${oRange.toString}
       |         : low = ${oRange.getLowerEndPoint}
       |         : high = ${oRange.getHigherEndPoint}
       |         : contains(3) = ${oRange.contains(3)}
     """.stripMargin)
  val lClosedROpen: LClosedROpenRange = new LClosedROpenRange(3, 8)
  println(
    s"""Left Closed Right Open Range: ${lClosedROpen.toString}
       |                            : low = ${lClosedROpen.getLowerEndPoint}
       |                            : high = ${lClosedROpen.getHigherEndPoint}
     """.stripMargin)
  var lOpenRClose: LOpenRClosedRange = new LOpenRClosedRange(3, 8)
  println(
    s"""Left Open Right Closed Range: ${lOpenRClose.toString}
       |                            : parsed("(4,10]")  = ${lOpenRClose = LOpenRClosedRange.parse("(4,10]"); lOpenRClose.toString}
       |                            : low = ${lOpenRClose.getLowerEndPoint}
       |                            : high = ${lOpenRClose.getHigherEndPoint}
     """.stripMargin)
}
