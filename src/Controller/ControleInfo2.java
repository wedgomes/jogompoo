package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import View.InformativoTitanossauro;

public class ControleInfo2 {

	private static InformativoTitanossauro infoTita;
	
	public ControleInfo2(InformativoTitanossauro t){
		infoTita = t;
	}
	
	public  void contInfo2(){
		getInfoTita().getOk().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getInfoTita().getOk()){
						getInfoTita().dispose();
					}
				}
			}
		});
		
		getInfoTita().addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent k) {
				if(k.getKeyCode() == KeyEvent.VK_ENTER) {
					getInfoTita().dispose();
				}
			}
		});
	}

	public static InformativoTitanossauro getInfoTita() {
		return infoTita;
	}
}

