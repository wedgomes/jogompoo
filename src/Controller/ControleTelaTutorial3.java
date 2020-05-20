package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.TelaTutorial3;

public class ControleTelaTutorial3 {

private static TelaTutorial3 telaInfo;
	
	public ControleTelaTutorial3(){
		telaInfo = new TelaTutorial3();
	}
	
	public void control2(){		
		getTelaInfo().getContinuarLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getTelaInfo().getContinuarLabel()){
						telaInfo.setVisible(false);
					//	ControleCorredor.getCorredor().setVisible(true);
					//	ControleTelaJogador.getTelaJogador().setVisible(true);
						ControleMenu.getMenu().setVisible(true);
						
					}
				}
			}
		});
}
	public static TelaTutorial3 getTelaInfo() {
		return telaInfo;
	}
}
