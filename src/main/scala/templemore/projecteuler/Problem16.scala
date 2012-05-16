package templemore.projecteuler

object Problem16 extends BasicMathsConcepts {
  def apply(number: Int, power: Int) = (BigInt(number).pow(power).toString map (_ - 48)).sum
}
