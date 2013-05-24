package org.bowling

class BowlingSpecs {

  "Bowling score calculator" should {
    
    "only one Strike" in {
      calculator.ciomputeScoreOf("9-") should be 9
    }
    
  }
  
}