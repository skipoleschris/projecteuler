package templemore.projecteuler

import org.specs2.Specification

class Problems1To10Spec extends Specification { def is =

  "Specification for the Project Euler problems"                                                  ^
                                                                                                  endp^
  "Finding the sum of all the multiples of 3 or 5 below 1000 should"                              ^
    "calculate the expected result of 233168"                                                     ! problem1^
                                                                                                  endp^
  "Finding the sum  if the even-valued terms in a Fibonacci sequence whose values do not exceed four million should" ^
    "calculate the expected result of 4613732"                                                    ! problem2^
                                                                                                  endp^
  "Finding the largest prime factor of the number 600851475143 should"                            ^
    "calculate the expected result of 6857"                                                       ! problem3^
                                                                                                  endp^
  "Finding the largest palindrome made from the product of two 3-digit numbers should"            ^
    "calculate the expected result of 906609"                                                     ! problem4^
                                                                                                  endp^
  "Finding the smallest positive number that is evenly divisible by all of the numbers from 1 to 20 should" ^
    "calculate the expected result of 232792560"                                                  ! problem5^
                                                                                                  endp^
  "Finding the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum should" ^    
    "calculate the expected result of 25164150"                                                   ! problem6^
                                                                                                  endp^
  "Finding the 10,001st prime number should"                                                      ^  
    "calculate the expected result of 104743"                                                     ! problem7^
                                                                                                  endp^
  "Finding the greatest product of five consecutive digits in the given 1000-digit number should" ^  
    "calculate the expected result of 40824"                                                      ! problem8^
                                                                                                  endp^
  "Finding the Pythagorean triplet for which a + b + c = 1000 should"                             ^
    "calculate the expected result of 31875000"                                                   ! problem9^  
                                                                                                  endp^
  "Finding the sum of all the primes below two million should"                                    ^
    "calculate the expected result of 142913828922"                                               ! problem10^
                                                                                                  end

  def problem1 = {
    Problem1(1000) must_== 233168
  }

  def problem2 = {
    Problem2(4000000) must_== 4613732
  }

  def problem3 = {
    Problem3(600851475143L) must_== 6857L
  }

  def problem4 = {
    Problem4() must_== 906609
  }

  def problem5 = {
    Problem5(20L) must_== 232792560L
  }

  def problem6 = {
    Problem6() must_== 25164150L
  }

  def problem7 = {
    Problem7(10001) must_== 104743
  }

  def problem8 = {
    Problem8() must_== 40824
  }

  def problem9 = {
    Problem9() must_== 31875000L
  }

  def problem10 = {
    Problem10() must_== 142913828922L
  }
}