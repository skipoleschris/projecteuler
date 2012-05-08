package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem4 {
  def apply() = {
    def products(min: Int, max: Int) = for ( x <- min to max; y <- min to max ) yield x * y
    def isPalindrome(x: Any) = x.toString == x.toString.reverse

    products(100, 999) filter isPalindrome max
  }
}