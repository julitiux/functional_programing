package com.functionalPrograming.chapter4;

import java.awt.*;
import java.util.function.Function;

public class CameraImpl implements Camera{

  Function<Color, Color> filter;

  @Override
  public Color capture(Color inputColor) {
    Color processColor = filter.apply(inputColor);
    //MORE PROCESSING OF COLOR...
    return processColor;
  }

}
