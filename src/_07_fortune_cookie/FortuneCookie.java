package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener{
	String fortune[] =  {"someone random will say hello to you today","you will win a lotery", 
			"you will see an animal that you thought had gone extinct", "you will be embarrassed at your own party", 
			"you will have to do something that is very dangerous"};
	public void showButton(){
		
		JFrame j = new JFrame();
		j.setVisible(true);
		JPanel p = new JPanel();
		p.setVisible(true);
		JButton b = new JButton();
		p.add(b);
		j.add(p);
		j.pack();
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		JOptionPane.showMessageDialog(null, fortune[rand]);
		
	}
}
