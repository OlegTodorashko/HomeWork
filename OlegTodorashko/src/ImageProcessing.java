

//import acm.graphics.GObject;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.*;

import javax.imageio.ImageIO;

import acm.graphics.GImage;

public class ImageProcessing {
    
	BufferedImage image = null;
	
	try {
	
	image = ImageIO.read(new File("x_db08f7fb.jpg");
	
	} catch (IOException c)
	
   private GImage flipHorizontal(GImage image) {
	
	int[][] array = image.getPixelArray();
	int width = array[0].length;
	int height = array.length;
	for (int row = 0; row < height; row++) {
	for (int p1 = 0; p1 < width / 2; p1++) {
	int p2 = width - p1 - 1;
	int temp = array[row][p1];
	array[row][p1] = array[row][p2];
	array[row][p2] = temp;
	}
	}
	return new GImage(array);
	}
	

    	
    	
    
	 public static void main(String[] args)
	  {
	    
	  }
	
	}
	

	

	


