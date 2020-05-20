package Controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.TelaTutorial1;

public class ControleTelaTutorial1 {

	private static TelaTutorial1 telaInfo;
	
	public ControleTelaTutorial1(){
		telaInfo = new TelaTutorial1();
	}
	
	public void control2(){		
		getTelaInfo().getContinuarLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getTelaInfo().getContinuarLabel()){
						telaInfo.setVisible(false);
					//	ControleCorredor.getCorredor().setVisible(true);
					//	ControleTelaJogador.getTelaJogador().setVisible(true);
						ControleTelaTutorial2.getTelaInfo().setVisible(true);
					}
				}
			}
		});
}
	public static TelaTutorial1 getTelaInfo() {
		return telaInfo;
	}
}
