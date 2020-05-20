package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaSalas extends JFrame{

	private JLabel sair;
	
	public TelaSalas(){
		sair = new JLabel("Imagens/botãoSair.png");
		sair.setBounds(50,250,100,100);
		
		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		setSize(800, 250);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setVisible(false);
	}
}
