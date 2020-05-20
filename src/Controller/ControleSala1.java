package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.swing.JOptionPane;

import Model.Entidade;
import Model.Personagem;
import View.Sala1;

public class ControleSala1 {

	private static Sala1 sala1;
	private int colisao = 0, colisaoSeguranca = 0;
	
	public ControleSala1(Personagem personagem) {
		personagem.setPosiX(16);
		
		sala1 = new Sala1(personagem);
		sala1.addKeyListener(new TAdapter());
	}

	public class TAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				getSala1().getPersonagem().andarLefth();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				getSala1().getPersonagem().andarRigth();
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				getSala1().getPersonagem().andarUp();
				checarColisao();
			}
			if (getSala1().getPersonagem().getPosiX() < -21) {
				getSala1().getPersonagem().setPosiX(-21);
			}
			if (getSala1().getPersonagem().getPosiX() > 720) {
				getSala1().getPersonagem().setPosiX(720);
			}
			getSala1().repaint();			
		}
	}

	public void checarColisao() {
			if ((getSala1().getPersonagem().getBounds().intersects(getSala1()
					.getSeguranca().getBounds()))) {
//				new ControleInfo1(new InformativoStegossauru()).contInfo1();
//				infor1.setVisible(true);
				sala1.getSeguranca().setPosiX(330);
				colisao++;
				colisaoSeguranca++;
				
				if(colisao >= 2) {
					sala1.getPorta().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
					sala1.getPorta().setPosiY(93);
				}
				ControleInfo1.getInfoStego().setVisible(true);
			}
			if ((getSala1().getPersonagem().getBounds().intersects(getSala1()
					.getSeguranca().getBounds()))) {
//				new ControleInfo2(new InformativoTitanossauro()).contInfo2();
//				infor1.setVisible(true);
				colisao++;
				colisaoSeguranca++;
				
					if(colisao >= 2) {
						sala1.getPorta().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
						sala1.getPorta().setPosiY(93);
					}
				ControleInfo2.getInfoTita().setVisible(true);
			}
			if ((getSala1().getPersonagem().getBounds().intersects(getSala1()
					.getPorta().getBounds())) && (colisao >= 2)) {
				System.out.println("Colisão Depois:"+colisao);
				
		//		colisao = 0;
				
				sala1.getSeguranca().setPosiX(80);
				ControleGeral.getSom().portaAbrindo();
//				getSala1().dispose();	
//				new ControleCorredor().getCorredor().getPersonagem().setPosiX(150);
				sala1.setVisible(false);
//				corredor.getPersonagem().setPosiX(150);
//				corredor.setVisible(true);
				ControleCorredor.mudarPorta2();
				ControleCorredor.getCorredor().getPersonagem().setPosiX(150);
				ControleCorredor.getCorredor().getPersonagem().setAparencia(2);
				ControleCorredor.getCorredor().setVisible(true);
			}
		}
		

	public static Sala1 getSala1() {
		return sala1;
	}
}