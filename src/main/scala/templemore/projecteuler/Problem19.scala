package templemore.projecteuler

object Problem19 extends TriangleTraversal {

  private val daysInMonth = Map(1 -> 31, 2 -> 28, 3 -> 31, 4 -> 30, 5 -> 31, 6 ->30,
                                7 -> 31, 8 -> 31, 9 -> 30, 10 -> 31, 11 -> 30, 12 -> 31)

  private case class StartOfMonth(month: Int, year: Int, day: Int) {
    def nextMonth: StartOfMonth = {
      def days: Stream[Int] = Stream.cons(1, Stream.cons(2, Stream.cons(3, Stream.cons(4, Stream.cons(5, Stream.cons(6, Stream.cons(7, days)))))))
      def daysFrom(now: Int, count: Int) = (days dropWhile (_ != now) drop count).head
      def leapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)

      month match {
        case 2 => StartOfMonth(3, year, daysFrom(day, daysInMonth(2) + (if (leapYear) 1 else 0)))
        case 12 => StartOfMonth(1, year + 1, daysFrom(day, daysInMonth(12)))
        case m => StartOfMonth(m + 1, year, daysFrom(day, daysInMonth(m)))
      }
    }
  }

  def apply() = {
    val january1900 = StartOfMonth(1, 1900, 1)
    val monthStream = Stream.iterate(january1900)(_.nextMonth)

    (monthStream dropWhile (_.year < 1901) takeWhile (_.year < 2001) filter (_.day == 7)).size
  }
}
