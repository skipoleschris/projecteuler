package templemore.projecteuler

import org.specs2.Specification

class Problems11To20Spec extends Specification { def is =

  "Specification for the Project Euler problems"                                                  ^
                                                                                                  endp^
  "Finding the greatest product of four adjacent numbers in any direction (up, down, left, right, or diagonally) in the supplied 20x20 grid should" ^
    "calculate the expected result of 70600674"                                                   ! problem11^
                                                                                                  endp^
  "Finding the first triangle number to have over five hundred divisors should"                   ^
    "calculate the expected result of 76576500"                                                   ! problem12^
                                                                                                  endp^
  "Finding the first ten digits of the sum of the given one-hundred 50-digit numbers should"      ^
    "calculate the expected result of 5537376230"                                                 ! problem13^                                                     
                                                                                                  endp^
  "Finding the starting number, under one million, produces the longest chain given: n -> n/2 (even), n -> 3n + 1 (odd) should" ^
    "calculate the longest chain number of 837799"                                                ! problem14^
                                                                                                  endp^
  "Finding the number of routes through a 20x20 grid without backtracking should"                 ^
    "calculate the expected result of 137846528820"                                               ! problem15^
                                                                                                  endp^
  "Finding the sum of the digits of the number 2^1000"                                            ^
    "calculate the expected result of 1366"                                                       ! problem16^
                                                                                                  endp^
  "Finding the number of letters required to write all the numbers 1 to 1000 in words"            ^
    "calculate the expected result of 21124"                                                      ! problem17^
                                                                                                  end

  def problem11 = {
    Problem11() must_== 70600674
  }

  def problem12 = {
    Problem12() must_== 76576500
  }

  def problem13 = {
    Problem13() must_== "5537376230"
  }

  def problem14 = {
    Problem14() must_== 837799
  }

  def problem15 = {
    Problem15(20) must_== 137846528820L
  }

  def problem16 = {
    Problem16(2, 1000) must_== 1366
  }

  def problem17 = {
    Problem17() must_== 21124
  }
}