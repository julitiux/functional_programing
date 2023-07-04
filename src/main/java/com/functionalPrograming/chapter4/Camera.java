package com.functionalPrograming.chapter4;

import java.awt.*;
import java.util.function.Function;

public interface Camera {
  Color capture(Color inputColor);

  void setFilters(final Function<Color, Color>... filters);
}
