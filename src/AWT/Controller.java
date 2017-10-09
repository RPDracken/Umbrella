package AWT;

public class Controller {
	private Model m_Mod;
	private View m_View;
	private int count;
	private String Message;
	Controller(String m) {
		m_Mod = new Model(300,200);
		Message = m;
		m_View = new View(m_Mod, Message);
	}
	void simulate() {
		for (int x = 0; x<count; ++x) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
			m_Mod.genNewKoor();
			m_View.repaint();
		}
	}
	void set_count(int x){
		count = x;
	}
}
