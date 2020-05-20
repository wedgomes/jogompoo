package View;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.ControleTelaTutorial1;


public class TelaTutorial1 extends JFrame{

	 private JLabel continuarLabel;
//	 private JLabel voltarLabel;
	 private JLabel fundoInfo;
	
	public TelaTutorial1(){
		setSize(500, 338);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		
		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		fundoInfo = new JLabel(new ImageIcon("Imagens//telaTutorial.png"));
		fundoInfo.setBounds(0, 0, 500, 333);
		
		ImageIcon imagemC = new ImageIcon("Imagens//continuar1.png");
		continuarLabel = new JLabel(imagemC);
		continuarLabel.setBounds(320, 280, 150, 50);
		
//		ImageIcon imagemV = new ImageIcon("Imagens//voltar1.png");
//		voltarLabel = new JLabel(imagemV);
//		voltarLabel.setBounds(40, 280, 100, 50);
		
		add(continuarLabel);
	//	add(voltarLabel);
		add(fundoInfo);
		
		setVisible(false);
	}

	
	public JLabel getContinuarLabel() {
		return continuarLabel;
	}

	public void setContinuarLabel(JLabel continuarLabel) {
		this.continuarLabel = continuarLabel;
	}

//	public JLabel getVoltarLabel() {
//		return voltarLabel;
//	}
//
//	public void setVoltarLabel(JLabel voltarLabel) {
//		this.voltarLabel = voltarLabel;
//	}

}

