package View;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class InformativoPterodactilo extends TelaInfo1{
	
	private JLabel fundoInformativo;
	
	public InformativoPterodactilo(){		
		fundoInformativo = new JLabel(new ImageIcon("Imagens//InformaçãoPterodactilo.png"));
		fundoInformativo.setBounds(0, 0, 400, 285);
		
		add(fundoInformativo);
		
		setVisible(false);
	} 
}