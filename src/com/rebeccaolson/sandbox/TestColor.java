package com.rebeccaolson.sandbox;

import java.awt.Color;

public class TestColor {

    TestColor()
    {
        Color c = new Color(242,242, 242);
        //Color c = new Color(171,0,250);
        
        System.out.println("-16776961 ("+c.getRed()+","+c.getGreen()+","+c.getBlue()+")  alpha:"+c.getAlpha());
        System.out.println(c.getRGB());
        //c = ColorUtils.bleach(c, .7f);
        System.out.println(c.getRGB());
    }
    
	public static void main(String[] args) {
	    TestColor tester = new TestColor();	    
	}

}
