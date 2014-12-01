package com.rebeccaolson.sandbox;

import java.awt.Color;

/** A set of tools for analyzing and manipulating colors */
public class ColorUtils
{

  /**
   * Lightens a color by a given amount
   * 
   * @param color The color to lighten
   * @param amount The amount to lighten the color. 0 will leave the color unchanged; 1 will make
   *        the color completely white
   * @return The bleached color
   */
  public static Color bleach(Color color, float amount)
  {
    int red = (int) ((color.getRed() * (1 - amount) / 255 + amount) * 255);
    int green = (int) ((color.getGreen() * (1 - amount) / 255 + amount) * 255);
    int blue = (int) ((color.getBlue() * (1 - amount) / 255 + amount) * 255);
    return new Color(red, green, blue);
  }
}
