package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem10 extends BasicMathsConcepts {
  def apply() = {
    def nextPrime(after: Long) = (Stream.iterate(after + 2L)(_ + 2L) dropWhile (!isPrime(_))).head
    (Stream.cons(2L, Stream.iterate(3L)(nextPrime _)) takeWhile (_ < 2000000L)).sum
  }
}

