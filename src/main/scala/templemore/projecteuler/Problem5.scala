package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem5 {
  def apply(max: Long) = {
    def fullyDivisible(l: Long) = 1L to max forall (l % _ == 0)
    Stream.iterate(max)(_ + max) dropWhile (!fullyDivisible(_)) head
  }
}