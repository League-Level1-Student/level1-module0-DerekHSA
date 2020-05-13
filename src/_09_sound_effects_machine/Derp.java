package _09_sound_effects_machine;

import java.applet.AudioClip;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Derp implements ActionListener {
	JFrame DIO=new JFrame();
	JPanel Pucci=new JPanel();
	JButton ichi=new JButton();
	JButton ni=new JButton();
	JButton san=new JButton();
	JButton yon=new JButton();
	JButton go=new JButton();
	JButton roku=new JButton();
	
	public void run() {
		ichi.addActionListener(this);
		ni.addActionListener(this);
		san.addActionListener(this);
		yon.addActionListener(this);
		roku.addActionListener(this);
		go.addActionListener(this);
	DIO.add(Pucci);
	Pucci.add(ichi);
	Pucci.add(ni);
	Pucci.add(san);
	Pucci.add(yon);
	Pucci.add(go);
	Pucci.add(roku);
	DIO.setVisible(true);
	DIO.pack();
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		// TODO Auto-generated method stub
		
		if (buttonPressed.equals(ichi)) {
			
			playSound("bizarre-guitar-daniel-simon.wav");
			
		}else if (buttonPressed.equals(ni)) {
			
			playSound("Bomb_Explosion_1-SoundBible.com-980698079.wav");
		}else if (buttonPressed.equals(san)) {
			playSound("Lighting_Match-SoundBible.com-329028361.wav");
		}else if (buttonPressed.equals(yon)) {
			playSound("sawing-wood-daniel-simon.wav");
		}else if (buttonPressed.equals(roku)) {
			playSound("sos-morse-code-daniel-simon.wav");
		}else if (buttonPressed.equals(go)) {
			playSound("Swoosh_1-SoundBible.com-231145780.wav");
		}
		
	}


private void playSound(String fileName) {
      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
      sound.play();
}

}
