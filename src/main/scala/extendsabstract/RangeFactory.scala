package extendsabstract

import extendsabstract.ClosedRange.{ClosedRange => ClassClosed}
import extendsabstract.OpenClosedRange.LClosedROpenRange.LClosedROpenRange
import extendsabstract.OpenClosedRange.LOpenRClosedRange.LOpenRClosedRange
import extendsabstract.OpenRange.{OpenRange => ClassOpen}

object RangeFactory {
  def newInstance(range: AbstRange): AbstRange = range match {
    case ClassClosed(low, high) => ClassClosed(low, high)
    case ClassOpen(low, high) => ClassOpen(low, high)
    case LClosedROpenRange(low, high) => LClosedROpenRange(low, high)
    case LOpenRClosedRange(low, high) => LOpenRClosedRange(low, high)
    case _ => range
  }
}
