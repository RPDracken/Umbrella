package jFrameWithPicture;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

class Loader{
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
	public Image loadTechBaum(){
			try {
				Image img = Toolkit.getDefaultToolkit().getImage("Tech Baum.jpg");
				}
			catch(Exception e){
					e.printStackTrace();
				}
			return Toolkit.getDefaultToolkit().getImage("Tech Baum.jpg");
	};
}

public class Controller {
	Controller(){
		View vie = new View(new Loader());
		vie.repaint();
	}
	public static void main(String[]args){
		new Controller();
	}

}
