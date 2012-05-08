package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem6 {
  def apply() = {
    val sumOfAll = (1L to 100L).sum
    val sumOfSquares = (1L to 100L map (n => n * n)).sum
    (sumOfAll * sumOfAll) - sumOfSquares
  }
}
