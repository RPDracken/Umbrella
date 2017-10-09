package AWT;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class My_Button extends Button{
	public My_Button(){
		super("click me");
		addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("I was clicked");
			}
		});
	}
}


