package templemore.projecteuler

object Problem1 {
  def apply(upto: Int) = 1 until upto filter (i => i % 3 == 0 || i % 5 == 0) sum
}