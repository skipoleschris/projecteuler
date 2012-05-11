package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

trait BasicMathsConcepts {
  def isPrime(l: Long): Boolean = l match {
    case x if ( x < 3 ) => true
    case x if ( x % 2 == 0 ) => false
    case x => Stream.iterate(3)(_ + 2) takeWhile (_ <= sqrt(l)) filter (l % _ == 0 ) isEmpty
  }

  def factors(l: Long): List[Long] = {
    @tailrec
    def collect(until: Long, at: Long = 1, results: List[Long] = Nil): List[Long] = at match {
      case x if ( x > until ) => results
      case x if ( l % x == 0 ) => collect(until, at + 1, x :: (l / x) :: results)
      case x => collect(until, at + 1, results)
    }
    
    collect(sqrt(l).toLong)
  }

  def product(nums: IndexedSeq[Int]): Int = nums.foldLeft(1)((acc, n) => acc * n)

  def pascalsTriangle: Stream[IndexedSeq[Long]] = 
    Stream.cons(IndexedSeq(1L), Stream.iterate(IndexedSeq(1L, 1L)) { last =>
      1L +: (last sliding 2 map (_.sum)).toIndexedSeq :+ 1L
    })
}
