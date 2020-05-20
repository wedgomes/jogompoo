package Controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

import View.Menu;

public class ControleMenu {

	private static Menu menu;
	
	public ControleMenu(){
		menu = new Menu();
	}
	
	public void control1(){
		getMenu().getJogarLabel().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getMenu().getJogarLabel()){
					//	ControleGeral.getSom().abertuarParar();
						menu.setVisible(false);
						ControleTelaJogador.getTelaJogador().setVisible(true);
					}
				}
			}
		});
		
		
		getMenu().getAjudaLabel().addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1){
					if(e.getSource() == getMenu().getAjudaLabel()){
					//	ControleGeral.getSom().abertuarParar();
						menu.setVisible(false);
						ControleTelaTutorial1.getTelaInfo().setVisible(true);
					}
				}
			}
		});
		
		
		getMenu().getCreditosLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == getMenu().getCreditosLabel()){
					menu.setVisible(false);
					ControleCredito.getCredito().setVisible(true);
				}
			}
		});
		
		getMenu().getSairLabel().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getSource() == getMenu().getSairLabel()){
					System.exit(0);
				}
			}
		});
	}

	public static Menu getMenu() {
		return menu;
	}
}
