package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem14 {
  def apply() = {
    def stream(start: Int) = Stream.iterate(start)(i => if ( i % 2 == 0) i/2 else (3 * i) + 1)

    ((1 to 999999).foldLeft(0, 0) { (acc, num) =>
      val maxChainLength = acc._2
      val len = (stream(num) takeWhile (_ > 1)).size
      if ( len > maxChainLength ) (num, len) else acc
    })._1
  }
}

