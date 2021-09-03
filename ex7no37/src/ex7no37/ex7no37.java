package ex7no37;

import java.awt.*;
import java.awt.event.*;

public class ex7no37 {  //  411p
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}

}

class EventHandler implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ActionEvent occirred!!!");
	}
}
