package com.functionalPrograming.chapter6

import spock.lang.Specification

import static com.functionalPrograming.chapter6.Evaluation.*

class EvaluationSpec extends Specification {

  def "eager Evaluator"() {
    expect:
    eagerEvaluator(evaluate(1), evaluate(2))
  }

  def "lazy Evaluator"() {
    expect:
    lazyEvaluator(() -> evaluate(1), () -> evaluate(2))
  }
}
