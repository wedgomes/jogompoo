package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.InformativoRex;

public class ControleInfo4 {

	private static InformativoRex infoRex;
	
	public ControleInfo4(InformativoRex r){
		infoRex = r;
	}
	
	public  void contInfo4(){
		getInfoRex().getOk().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getInfoRex().getOk()){
						getInfoRex().dispose();
					}
				}
			}
		});
		
		getInfoRex().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if(k.getKeyCode() == KeyEvent.VK_ENTER) {
					getInfoRex().dispose();
				}
			}
		});
	}

	public static InformativoRex getInfoRex() {
		return infoRex;
	}
}
