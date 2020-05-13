package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FORTUNEcookie implements ActionListener {
	public void showButton() {
		JFrame SHIZA=new JFrame();
        SHIZA.setVisible(true);
        JButton button = new JButton();
        SHIZA.add(button);
        SHIZA.pack();
        button.addActionListener(this);

        
}
   

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand==0) {
			JOptionPane.showMessageDialog(null,"your luck will increase by 8%");
	}else if (rand==1) {
			JOptionPane.showMessageDialog(null,"your luck will increase by 5%");
	}else if (rand==2) {
			JOptionPane.showMessageDialog(null,"your luck will increase by 2%");
	}else if (rand==3) {
		JOptionPane.showMessageDialog(null,"your luck will increase by 7%");
	}else if (rand==4) {
	JOptionPane.showMessageDialog(null,"your luck will increase by 100%");
}
		}
}

