package jFrameWithPicture;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyImage extends JPanel {
	private Image Img = null;
	private String name;
	private int namenumb;
	
	MyImage(String s, int i){
		name = s;
		namenumb = i;
	}
	public Image getImage(){
		return Img;
	}
	public void loadImage(){
		try{
		Img = ImageIO.read(new File((String) (name + namenumb)));
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
	public ImageIcon resize(ImageIcon imageIcon, int scaleWidth, int scaleHeight){
		int oldWidth = imageIcon.getIconWidth();
		int oldHeight = imageIcon.getIconHeight();
		int newWidth =  scaleWidth - 100;
		int newHeight = scaleHeight - 100;
		
		BufferedImage bi = new BufferedImage(newWidth, newHeight, BufferedImage.TRANSLUCENT);
		Graphics2D g2d = (Graphics2D) bi.createGraphics();
		g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
		g2d.drawImage(imageIcon.getImage(), 0, 0, newWidth, newHeight, null);
		g2d.dispose();
		
		return new ImageIcon(bi);
	}

}
