package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaInfo1 extends JFrame{

	private JLabel ok;
	
	public TelaInfo1(){
		setSize(400, 285);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		
		ImageIcon imagemOk = new ImageIcon("Imagens//OK.png");
		ok = new JLabel(imagemOk);
		ok.setBounds(270, 220, 100, 47);
		
		add(ok);
	}
	
	public JLabel getOk() {
		return ok;
	}
}
