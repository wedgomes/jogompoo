package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.TelaTutorial2;

public class ControleTelaTutorial2 {

	private static TelaTutorial2 telaInfo;
	
	public ControleTelaTutorial2(){
		telaInfo = new TelaTutorial2();
	}
	
	public void control2(){		
		getTelaInfo().getContinuarLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getTelaInfo().getContinuarLabel()){
						telaInfo.setVisible(false);
					//	ControleCorredor.getCorredor().setVisible(true);
					//	ControleTelaJogador.getTelaJogador().setVisible(true);
					//	ControleMenu.getMenu().setVisible(true);
						ControleTelaTutorial3.getTelaInfo().setVisible(true);						
					}
				}
			}
		});
}
	public static TelaTutorial2 getTelaInfo() {
		return telaInfo;
	}
}
