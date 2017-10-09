package jFrameWithPicture;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;



public class View extends JFrame{
	private MyImage[] cargo;
	private JLabel label1 = new JLabel();
	private JPanel panelFrame = new JPanel();
	private JPanel panelEast = new JPanel();
	private JPanel panelWest = new JPanel();
	private JPanel panelSouth = new JPanel();
	private JPanel panelNorth = new JPanel();
	private JPanel panelCenter = new JPanel();
	View(MyImage[] c){
		cargo = c;
		BorderLayout bor = new BorderLayout();
		GridLayout grid = new GridLayout(3,1);
		setTitle("Image Test");
		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width-dim.width,dim.height/20-10);
		setSize(dim.width/2, dim.height/2);
		panelEast.setLayout(grid);
		panelEast.add(new Button("click"));
		panelEast.add(new Button("test"));
		panelEast.add(new Button("juhu"));
		panelEast.add(new Button("huhu"));
		panelSouth.setLayout(new GridLayout(1,1));
		panelFrame.setLayout(bor);
		bor.maximumLayoutSize(panelCenter);
		//image1 = new ImageIcon(getClass().getResource("665808.jpg"));
		ImageIcon imIcM = new ImageIcon(cargo[0].getImage());
		label1.setIcon(cargo[0].resize(imIcM, dim.width, dim.height));
		ImageIcon imIcS1 = new ImageIcon(cargo[1].getImage());
		JLabel labels = new JLabel();
		labels.setIcon(cargo[1].resize(imIcS1, dim.width/4, dim.height/4));
		panelSouth.add(labels);
		panelCenter.add(bor.CENTER, label1);
		panelFrame.add(bor.EAST, panelEast);
		panelFrame.add(bor.WEST, panelWest);
		panelFrame.add(bor.NORTH, panelNorth);
		panelCenter.setSize(100, 100);
		panelFrame.add(bor.CENTER, panelCenter);
		panelFrame.add(bor.SOUTH, panelSouth);
		panelFrame.setSize(200, 200);
		add(panelFrame);
		//validate();
		
		//setSize(dim.width,dim.height-50);
		
		//pack();
		setVisible(true);
		getContentPane().repaint();
		
	}
	
	/*@Override
	public void paint(Graphics g){
		final Insets INS = getInsets();
		g.drawImage(image1, INS.left, INS.top, this);
		
	}*/
}
