package View;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InformativoRex extends TelaInfo1{

	private JLabel fundoInformativo;
	
	public InformativoRex(){
		fundoInformativo = new JLabel(new ImageIcon("Imagens//InformaçãoRex.png"));
		fundoInformativo.setBounds(0, 0, 400, 285);
		
		add(fundoInformativo);
		
		setVisible(false);
	}
}
