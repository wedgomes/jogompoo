package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.Creditos;

public class ControleCredito {

	private static Creditos credito;
	
	public ControleCredito(){
		credito = new Creditos();
	}
	
	public void controlCredito(){
		getCredito().getOk().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getCredito().getOk()){
						credito.setVisible(false);
						ControleMenu.getMenu().setVisible(true);
					}
				}
			}
		});
	}

	public static Creditos getCredito() {
		return credito;
	}
}
