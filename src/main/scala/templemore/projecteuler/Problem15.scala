package templemore.projecteuler

object Problem15 extends BasicMathsConcepts {
  def apply(dimension: Int) = (pascalsTriangle drop (dimension * 2)).head.max
}
