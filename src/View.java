import java.awt.Graphics;
import javax.swing.*;
public class View extends JFrame {
	private Model mod;
	View(Model m, int h, int b){
	mod = m;
	final JSlider SLIDER = new JSlider(JSlider.VERTICAL,10,100,15);
	//setBounds(120,120,h,b);
	SLIDER.setMajorTickSpacing(20);
	SLIDER.setMinorTickSpacing(1);
	add(SLIDER);
	pack();
	
	
	setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		g.drawOval(mod.get_x(), mod.get_y(), mod.reBreite(), mod.reHöhe());
		
	}
}
