package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem7 extends BasicMathsConcepts {
  def apply(requiredItem: Int) = {
    def nextPrime(after: Long) = (Stream.iterate(after + 2L)(_ + 2L) dropWhile (!isPrime(_))).head
    (Stream.cons(2L, Stream.iterate(3L)(nextPrime _)) drop (requiredItem - 1)).head
  }
}
