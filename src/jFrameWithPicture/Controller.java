package jFrameWithPicture;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;


public class Controller {
	MyImage[] cargo = new MyImage[2];
	String name = "Bild";
	Controller(){
		fillImageArray();
		View vie = new View(cargo);
		vie.repaint();
	}
	public static void main(String[]args){
		new Controller();
	}
	private void fillImageArray(){
		for (int i = 0; i<cargo.length; ++i){
			cargo[i] = new MyImage(name, i);
			cargo[i].loadImage();
		}
	}

}
