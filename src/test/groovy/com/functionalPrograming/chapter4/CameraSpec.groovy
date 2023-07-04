package com.functionalPrograming.chapter4

import spock.lang.Specification

import java.awt.*
import java.util.function.Consumer

class CameraSpec extends Specification {

  def "print captured"() {
    given:
    Camera camera = new CameraImpl()
    expect:
    Consumer<String> printCaptured = (filterInfo) ->
      println(String.format("with %s: %s", filterInfo, camera.capture(new Color(200, 100, 200))));
  }
}
