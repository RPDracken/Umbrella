
public class Control_Panel {
	private Model mod;
	private View vie;
	
	Control_Panel(){
		int h�he = 200;
		int breite = 200;
		mod = new Model(h�he,breite);
		vie = new View(mod,h�he,breite);
		simulate();
	}
	void simulate(){
		while (true){
			mod.reLocate();
			vie.repaint();
		}
	}
	public static void main(String[]args){
		new Control_Panel();
	}

}
