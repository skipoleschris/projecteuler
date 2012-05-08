package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem3 extends BasicMathsConcepts {
  def apply(of: Long) = factors(of) filter isPrime max
}