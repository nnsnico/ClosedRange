package extendsabstract

object OpenClosedRange {

  object LClosedROpenRange {
    def parse(s: String): LClosedROpenRange = {
      val parsed = s.trim.tail.init.split("[,\\s]+")
      LClosedROpenRange(parsed(0).toInt, parsed(1).toInt)
    }

    case class LClosedROpenRange(low: Int, high: Int) extends AbstRange {
      require(low < high)

      override def getLowerEndPoint: Int = low

      override def getHigherEndPoint: Int = high

      override def getIntersection(range: AbstRange): AbstRange =
        LClosedROpenRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

      override def contains(base: Int): Boolean = if (low <= base && high > base) true else false

      override def toString: String = s"[$low,$high)"
    }

  }

  object LOpenRClosedRange {
    def parse(s: String): LOpenRClosedRange = {
      val parsed = s.trim.tail.init.split("[,\\s]+")
      LOpenRClosedRange(parsed(0).toInt, parsed(1).toInt)
    }

    case class LOpenRClosedRange(low: Int, high: Int) extends AbstRange {
      require(low < high)

      override def getLowerEndPoint: Int = low

      override def getHigherEndPoint: Int = high

      override def getIntersection(range: AbstRange): AbstRange =
        LOpenRClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

      override def contains(base: Int): Boolean = if (low < base && high >= base) true else false

      override def toString: String = s"($low,$high]"
    }

  }

}
