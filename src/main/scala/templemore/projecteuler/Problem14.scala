package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem14 {
  def apply() = {
    def stream(start: Long) = Stream.iterate(start)(i => if ( i % 2L == 0) i/2L else (3L * i) + 1L)

    ((1L to 999999L).foldLeft(0L, 0L) { (acc, num) =>
      val maxChainLength = acc._2
      val len = (stream(num) takeWhile (_ > 1L)).size
      if ( len > maxChainLength ) (num, len) else acc
    })._1
  }
}

