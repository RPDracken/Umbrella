package AWT;

import java.util.Scanner;

public class Control_Panel {
	private Scanner Command = new Scanner(System.in);
	private String Message = Command.next();
	
	Control_Panel(){
		Controller c = new Controller(Message);
		c.set_count(1000);
		c.simulate();
	}
	public static void main(String[] args) throws Exception {
		new Control_Panel();
	}
}
