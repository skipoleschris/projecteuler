package templemore.projecteuler

object Problem17 extends BasicMathsConcepts {
  private val SingleDigits = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five",
                                 6 -> "six", 7 -> "seven", 8 -> "eight", 9 -> "nine", 0 -> "")
  private val TenDigits = Map(2 -> "twenty", 3 -> "thirty", 4 -> "forty", 5 -> "fifty",
                              6 -> "sixty", 7 -> "seventy", 8 -> "eighty", 9 -> "ninety")
  private val TeenDigits = Map(10 -> "ten", 11 -> "eleven", 12 -> "twelve", 13 -> "thirteen", 14 -> "fourteen",
                               15 -> "fifteen", 16 -> "sizteen", 17 -> "seventeen", 18 -> "eighteen", 19 -> "nineteen")

  private def asWords(i: Int): String = i match {
    case 1000 => "one thousand"
    case h if (h > 99) => SingleDigits(h / 100) + " hundred" + (if ( h % 100 != 0) " and " else "") + asWords(h % 100)
    case t if (t > 19) => TenDigits(t / 10) + (if ( t % 10 != 0 ) "-" else "") + asWords(t % 10)
    case t if (t > 9) => TeenDigits(t)
    case u => SingleDigits(u)
  }

  def apply() = ((1 to 1000 map asWords).mkString filter (ch => ch >= 'a' && ch <= 'z')).length
}
