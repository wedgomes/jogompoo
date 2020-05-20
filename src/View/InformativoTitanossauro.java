package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InformativoTitanossauro extends TelaInfo2{

	private JLabel fundoInformativo;
	
	public InformativoTitanossauro(){		
		fundoInformativo = new JLabel(new ImageIcon("Imagens//InformaçãoTitanossauro.png"));
		fundoInformativo.setBounds(0, 0, 500, 285);
		
		add(fundoInformativo);
		
		setVisible(false);
	}
}
