package templemore.projecteuler

import scala.annotation.tailrec

trait TriangleTraversal {
  type Path = List[Int]
  type ReducedItem = Tuple2[Int, Path]

  def highestValueRoute(triangle: List[List[Int]]): Path = {
    @tailrec
    def reduce(line: List[Int], lastLine: List[ReducedItem], result: List[ReducedItem] = Nil): List[ReducedItem] = line match {
      case x1 :: x2 :: xs => {
        val left = x1 + lastLine.head._1
        val right = x2 + lastLine.drop(1).head._1
        if ( left >= right ) reduce(x2 :: xs, lastLine.tail, (left, x1 :: lastLine.head._2) :: result)
        else reduce(x2 :: xs, lastLine.tail, (right, x2 :: lastLine.drop(1).head._2) :: result)
      }
      case _ => result.reverse
    }

    var emptyLastLine: List[ReducedItem] = triangle.last map (_ => (0, List[Int]()))
    var bestPath = triangle.tail.foldRight(emptyLastLine) { (line, acc) => reduce(line, acc) }
    triangle.head.head :: bestPath.head._2
  }
}
