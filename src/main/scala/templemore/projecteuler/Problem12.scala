package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem12 extends BasicMathsConcepts {
  def apply() = {
    def triangles(total: Long = 0, last: Long = 0): Stream[Long] = {
      val next = last + 1
      val newTotal = total + next
      Stream.cons(newTotal, triangles(newTotal, next))
    }
    
    (triangles() dropWhile (factors(_).size < 500)).head
  }
}
