package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.InformativoStegossauru;

public class ControleInfo1 {

	private static InformativoStegossauru infoStego;
	
	public ControleInfo1(InformativoStegossauru s){
		infoStego = s;
	}
	
	public  void contInfo1(){
		getInfoStego().getOk().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getInfoStego().getOk()){
						infoStego.setVisible(false);
					}
				}
			}
		});
		
		getInfoStego().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if(k.getKeyCode() == KeyEvent.VK_ENTER) {
					infoStego.setVisible(false);
				}
			}
		});
	}

	public static InformativoStegossauru getInfoStego() {
		return infoStego;
	}
}
