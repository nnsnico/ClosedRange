package extendsabstract

import extendsabstract.ClosedRange.{ClosedRange => ClassClosed}
import extendsabstract.OpenRange.{OpenRange => ClassOpen}
import extendsabstract.OpenClosedRange.LOpenRClosedRange
import extendsabstract.OpenClosedRange.LClosedROpenRange.{LClosedROpenRange => ClassLcRo}
import extendsabstract.OpenClosedRange.LOpenRClosedRange.{LOpenRClosedRange => ClassLoRc}

object RangeMain extends App {
  val cRange: AbstRange = RangeFactory.newInstance(ClassClosed(3, 8))
  println(
    s"""ClosedRange: ${cRange.toString}
       |           : low = ${cRange.getLowerEndPoint}
       |           : high = ${cRange.getHigherEndPoint}
       |           : contains(4) = ${cRange.contains(4)}
     """.stripMargin)
  val oRange: AbstRange = RangeFactory.newInstance(ClassOpen(3, 8))
  println(
    s"""OpenRange: ${oRange.toString}
       |         : low = ${oRange.getLowerEndPoint}
       |         : high = ${oRange.getHigherEndPoint}
       |         : contains(3) = ${oRange.contains(3)}
     """.stripMargin)
  val lClosedROpen: AbstRange = RangeFactory.newInstance(ClassLcRo(3, 8))
  println(
    s"""Left Closed Right Open Range: ${lClosedROpen.toString}
       |                            : low = ${lClosedROpen.getLowerEndPoint}
       |                            : high = ${lClosedROpen.getHigherEndPoint}
     """.stripMargin)
  var lOpenRClose: AbstRange = RangeFactory.newInstance(ClassLoRc(3, 8))
  println(
    s"""Left Open Right Closed Range: ${lOpenRClose.toString}
       |                            : parsed("(4,10]")  = ${lOpenRClose = LOpenRClosedRange.parse("(4,10]"); lOpenRClose.toString}
       |                            : low = ${lOpenRClose.getLowerEndPoint}
       |                            : high = ${lOpenRClose.getHigherEndPoint}
     """.stripMargin)
}
