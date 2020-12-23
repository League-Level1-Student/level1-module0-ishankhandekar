package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class soundEffectsMachine implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();

	public void run() {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		b1.setText("airplane landing");
		b2.setText("alien spaceship");
		b3.setText("sawing wood");
		b4.setText("muscle car");
		b5.setText("heavy rain");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		j.add(p);
		j.setVisible(true);
		j.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			playSound("airplane-landing_daniel_simion.wav");
		}else if(e.getSource() == b2) {
			playSound("alien-spaceship_daniel_simion.wav");
		}
		else if(e.getSource() == b3) {
			playSound("sawing-wood-daniel_simon.wav");
		} 
		else if(e.getSource() == b4) {
			playSound("muscle-car-daniel_simon.wav");
		}
		else if(e.getSource() == b5) {
			playSound("heavy-rain-daniel_simon.wav");
		}
	}private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}


}
