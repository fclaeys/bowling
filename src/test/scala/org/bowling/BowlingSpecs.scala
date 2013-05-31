package org.bowling

import org.specs2.mutable.Specification

class BowlingSpecs extends Specification{
  val calculator : Calculator = new Calculator
  "Bowling score calculator" should {
    
    "only one Strike" in {
      calculator.computeScoreOf("9-") must beEqualTo(9)
    }
    
    "only on Strike with another value" in {
      calculator.computeScoreOf("4-") must beEqualTo(4)
    }
    
  }
  
}