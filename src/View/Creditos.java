package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Creditos extends JFrame{

	private JLabel ok;
	private JLabel fundoCredito;
	
	public Creditos(){
		setSize(500, 285);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setUndecorated(true);
		
		fundoCredito = new JLabel(new ImageIcon("Imagens//creditosFundo.png"));
		fundoCredito.setBounds(0, 0, 500, 285);
		
		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		ImageIcon imagemOk = new ImageIcon("Imagens//OK.png");
		ok = new JLabel(imagemOk);
		ok.setBounds(275, 230, 100, 47);
		
		add(ok);
		add(fundoCredito);
		
		setVisible(false);
	}

	public JLabel getOk() {
		return ok;
	}
}

