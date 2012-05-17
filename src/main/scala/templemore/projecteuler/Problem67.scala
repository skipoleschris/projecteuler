package templemore.projecteuler

import scala.io.Source

object Problem67 extends TriangleTraversal {
  def apply() = {
    val source = Source.fromInputStream(this.getClass.getResourceAsStream("/templemore/projecteuler/problem67.txt"))
    val triangle = (source.getLines map (line => (line.split(' ') map (_.toInt)).toList)).toList
    highestValueRoute(triangle).sum
    }
}
