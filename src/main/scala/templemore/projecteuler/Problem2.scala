package templemore.projecteuler

object Problem2 {
  def apply(max: Int) = {
    def fibs: Stream[Long] = { 
      def inner(a: Long, b: Long): Stream[Long] = Stream.cons(a, inner(b, a + b))
      inner(0,1)
    }
    fibs takeWhile (_ <= max) filter (_ % 2 == 0) sum
  }
}