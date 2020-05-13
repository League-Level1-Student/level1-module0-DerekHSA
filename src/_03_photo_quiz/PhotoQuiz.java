package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame dio = new JFrame();
		dio.setVisible(true);
		// This will make sure the program exits when you close the window
		dio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//e
		// 1. find an image on the , and put its URL in a String
		// variable (from your browser, right click on the image, and select
		//  Image )
String jotaro="https://static.jojowiki.com/images/thumb/c/ca/Jotaro_DU_Infobox_Anime.PNG/270px-Jotaro_DU_Infobox_Anime.PNG";	
		// 2. create a variable of type "Component" that will hold your image
Component giorno;
		// 3. use the "createImage()" method below to initialize your Component
giorno=createImage(jotaro);
		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

dio.add(giorno);
dio.pack();
		// 6. ask a question that relates to the image
String Answer=JOptionPane.showInputDialog(null, "Who is this?");		
if (Answer.equalsIgnoreCase("Jotaro Kujo")) {
JOptionPane.showMessageDialog(null, "CORRECT");
} else if(Answer.equalsIgnoreCase("Jotaro")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
	

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
dio.remove(giorno);
		// 10. find another image and create it (might take more than one line
		// of code)
String kakyoin="https://www.anime-planet.com/images/characters/noriaki-kakyoin-19396.jpg?t=1400871227";
		// 11. add the second image to the quiz window
Component narancia;
narancia=createImage(kakyoin);
		// 12. pack the quiz window
dio.add(narancia);
dio.pack();
		// 13. ask another question
String question=JOptionPane.showInputDialog(null, "Who is this?");		
if (question.equalsIgnoreCase("Noriaki Kakyoin")) {
JOptionPane.showMessageDialog(null, "CORRECT");
} else if(question.equalsIgnoreCase("Kakyoin")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT");
}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String a) throws MalformedURLException {
		URL url = new URL(a);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
