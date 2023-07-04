package com.functionalPrograming.chapter4;

import java.awt.*;
import java.util.function.Function;
import java.util.stream.Stream;

public class CameraImpl implements Camera {

  Function<Color, Color> filter;

  @Override
  public Color capture(Color inputColor) {
    Color processColor = filter.apply(inputColor);
    //MORE PROCESSING OF COLOR...
    return processColor;
  }

  @Override
  public void setFilters(Function<Color, Color>... filters) {
    filter = Stream.of(filters)
      .reduce((filter, next) -> filter.compose(next))
      .orElseGet(Function::identity);
  }

  public void Camera() {
    setFilters();
  }

}
