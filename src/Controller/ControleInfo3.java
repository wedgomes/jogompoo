package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.InformativoPterodactilo;

public class ControleInfo3 {

	private static InformativoPterodactilo infoPiter;
	
	public ControleInfo3(InformativoPterodactilo p){
		infoPiter = p;
	}
	
	public  void contInfo3(){
		getInfoPiter().getOk().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getInfoPiter().getOk()){
						getInfoPiter().dispose();
					}
				}
			}
		});
		
		getInfoPiter().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if(k.getKeyCode() == KeyEvent.VK_ENTER) {
					getInfoPiter().dispose();
				}
			}
		});
	}

	public static InformativoPterodactilo getInfoPiter() {
		return infoPiter;
	}
}
