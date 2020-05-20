package View;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class InformativoStegossauru extends TelaInfo2{

	private JLabel fundoInformativo;
	
	public InformativoStegossauru(){		
		fundoInformativo = new JLabel(new ImageIcon("Imagens//InformaçãoStegossaurus.png"));
		fundoInformativo.setBounds(0, 0, 500, 285);
		
		add(fundoInformativo);
		
		setVisible(false);
	}
}
