package templemore.projecteuler

import annotation.tailrec
import scala.math.sqrt

object Problem9 extends BasicMathsConcepts {
  def apply() = {
    (for ( c <- 1 to 1000;
           b <- 1 to 1000 if (b < c);
           a <- 1 to 1000 if (a < b && (a + b + c) == 1000) && ((a * a) + (b * b) == (c * c))) yield a * b * c).head
  }
}
