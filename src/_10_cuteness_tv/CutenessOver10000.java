package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessOver10000 implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	public void run() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.pack();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setVisible(true);
		b1.setText("yare yare daze");
		b2.setText("Frog");
		b3.setText("Fluffy Unicorns");
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		// TODO Auto-generated method stub
		if(buttonPressed.equals(b1)) {
			showDucks();
		}else if(buttonPressed.equals(b2)) {
			showFrog();
		}else if(buttonPressed.equals(b3)) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	      playVideo("https://www.youtube.com/watch?time_continue=1&v=yWDAw2nsIjw&feature=emb_logo");
	 }

	void showFrog() {
	      playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	 }

	void showFluffyUnicorns() {
	      playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	 }

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	      try {
	      if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	      if (Runtime.getRuntime().exec(new String[] { 
	       "which", "xdg- open" }).getInputStream().read() != -1) {
	      Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	      }
	      } else {
	           URI uri = new URI(videoID);
	           java.awt.Desktop.getDesktop().browse(uri);
	      }      } catch (Exception e) {
	           e.printStackTrace();
	      }
	}
}
