package com.functionalPrograming.chapter6

import spock.lang.Specification

import static com.functionalPrograming.chapter6.Evaluation.eagerEvaluator
import static com.functionalPrograming.chapter6.Evaluation.evaluate

class EvaluationSpec extends Specification{

  def"eager Evaluator"(){
    expect:
    eagerEvaluator(evaluate(1), evaluate(2))
  }
}
