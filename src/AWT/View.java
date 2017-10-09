package AWT;

import java.awt.*;
import java.awt.event.*;

public class View extends Frame {
	private Model m_Mod;
	private String Message;
	View(Model mod, String M) {
		m_Mod = mod;
		Message = M;
		//setSize(m_Mod.m_W1_maxX + (m_Mod.m_W1_maxX/2),m_Mod.m_W1_maxY * 2);
		setBounds(100,100,500,500);
		setLayout(null);
		MenuBar menuBar = new MenuBar();
			Menu main_Menu = new Menu("Datei");
				main_Menu.add(new MenuItem("Ausführen"));
				main_Menu.add(new CheckboxMenuItem("Pausieren"));
				main_Menu.addSeparator();
				MenuItem end_Program = new MenuItem("Beenden", new MenuShortcut(KeyEvent.VK_B));
				main_Menu.add(end_Program);
			Menu sec_Menu = new Menu ("View");
			Menu change_View = new Menu ("Change View");
				sec_Menu.add(change_View);
				change_View.add("Schwarz-Weiß");
				change_View.add("Blau-Weiß");
		menuBar.add(main_Menu);
		menuBar.add(sec_Menu);
		menuBar.setHelpMenu(new Menu("Help"));
		//menuBar.add(new Menu("Datei"));
		setMenuBar(menuBar);
		My_Button b = new My_Button();
		b.setBounds(350, 100, 80, 50);
		add(b);
		setVisible(true);
		
		end_Program.addActionListener(e-> {
			System.out.println(e.getActionCommand());
			dispose();
		});
		//setBounds(50,100,300,200);
		//setBounds(100,100,300,200);
		//setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
			public void windowIconified(WindowEvent e) {
				setExtendedState(Frame.NORMAL);
			}
		});
		//setSize(75,75);
		//add(new My_Button());
		//setVisible(true);
		/*setBounds(100,100,300,200);
		final Checkbox check = new Checkbox("vielleicht");
		add(check);
		check.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				System.out.println(e.getStateChange());
				System.out.println(check.getState());
			}
		});
		setVisible(true);*/
	}
	@Override
	public void paint(Graphics g){
		final Insets ins = getInsets();
		final Dimension dim = getSize();
		g.drawLine(m_Mod.m_W1_X1 + ins.left,m_Mod.m_W1_Y1 + ins.top,m_Mod.m_W1_X2 + ins.left,m_Mod.m_W1_Y2 + ins.top);
		g.drawLine(m_Mod.m_W2_X1 + ins.left,m_Mod.m_W2_Y1 + ins.top,m_Mod.m_W2_X2 + ins.left,m_Mod.m_W2_Y2 + ins.top);
		g.drawRect(ins.left, ins.top, m_Mod.m_W1_maxX, m_Mod.m_W1_maxY);
		g.drawRect(ins.left, ins.top, m_Mod.m_W1_maxX, m_Mod.m_W1_maxY + m_Mod.m_W1_maxY);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(ins.left + m_Mod.m_W1_maxX, ins.top + 20,(m_Mod.m_W1_maxX /2), m_Mod.m_W1_maxY + m_Mod.m_W1_maxY - 20);
		g.setColor(Color.BLACK);
		g.drawRect(ins.left + m_Mod.m_W1_maxX, ins.top + 20,(m_Mod.m_W1_maxX /2), m_Mod.m_W1_maxY + m_Mod.m_W1_maxY - 20);
		g.drawRect(ins.left + m_Mod.m_W1_maxX, ins.top, m_Mod.m_W1_maxX /2, 20);
		g.drawString(Message, ins.left + m_Mod.m_W1_maxX + 5, ins.top + 15);
	}
}
