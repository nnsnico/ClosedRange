package extendsabstract

object OpenClosedRange {
  object LClosedROpenRange {
    def parse(s: String): LClosedROpenRange = {
      val parsed = s.trim.tail.init.split("[,\\s]+")
      new LClosedROpenRange(parsed(0).toInt, parsed(1).toInt)
    }

    class LClosedROpenRange(low: Int, high: Int) extends AbstRange {
      require(low < high)

      override def getLowerEndPoint: Int = low

      override def getHigherEndPoint: Int = high

      override def getIntersection(range: AbstRange): AbstRange =
        new LClosedROpenRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

      override def contains(base: Int): Boolean = if (low <= base && high > base) true else false

      override def toString: String = s"[$low,$high)"
    }
  }

  object LOpenRClosedRange {
    def parse(s: String): LOpenRClosedRange = {
      val parsed = s.trim.tail.init.split("[,\\s]+")
      new LOpenRClosedRange(parsed(0).toInt, parsed(1).toInt)
    }

    class LOpenRClosedRange(low: Int, high: Int) extends AbstRange {
      require(low < high)

      override def getLowerEndPoint: Int = low

      override def getHigherEndPoint: Int = high

      override def getIntersection(range: AbstRange): AbstRange =
        new LOpenRClosedRange(low max range.getLowerEndPoint, high min range.getHigherEndPoint)

      override def contains(base: Int): Boolean = if (low < base && high >= base) true else false

      override def toString: String = s"($low,$high]"
    }
  }
}
