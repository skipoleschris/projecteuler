package templemore.projecteuler

import org.specs2.Specification

class Problems61To70Spec extends Specification { def is =

  "Specification for the Project Euler problems"                                                  ^
                                                                                                  endp^
  "Finding the maximum total from top to bottom of a triangle should"                             ^
    "calculate the expected result of 7273"                                                       ! problem67^
                                                                                                  end

  def problem67 = {
    Problem67() must_== 7273
  }
}