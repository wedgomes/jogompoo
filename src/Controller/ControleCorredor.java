package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.util.ArrayList;

import Model.LeitorTXT;
import Model.Pergunta;
import View.Corredor;
import View.TelaPergunta;

public class ControleCorredor {

	private static Corredor corredor;
	private int contadorPorta1 = 0, contadorPorta2 = 0, contEnter = 0;
	private ControleTelaPergunta tp;

	public ControleCorredor() {
		
		corredor = new Corredor();
		corredor.addKeyListener(new TAdapter());
	
	}

	
	public class TAdapter extends KeyAdapter {

		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				getCorredor().getPersonagem().andarLefth();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				getCorredor().getPersonagem().andarRigth();
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				getCorredor().getPersonagem().andarUp();
				checarColisao();
			}

			if (getCorredor().getPersonagem().getPosiX() < -21) {
				getCorredor().getPersonagem().setPosiX(-21);
			}
			if (getCorredor().getPersonagem().getPosiX() > 720) {
				getCorredor().getPersonagem().setPosiX(720);
			}
			
			getCorredor().repaint();
		}
	}

	public void checarColisao() {
		if ((getCorredor().getPersonagem().getBounds().intersects(getCorredor()
				.getPorta1().getBounds()))) {
			ControleGeral.getSom().portaAbrindo();
			contadorPorta1=1;
			corredor.setVisible(false);
			ControleSala1.getSala1().getPersonagem().setAparencia(2);
			ControleSala1.getSala1().getPersonagem().setPosiX(16);
			ControleSala1.getSala1().setVisible(true);
		}
		if ((getCorredor().getPersonagem().getBounds().intersects(getCorredor()
				.getPorta2().getBounds())) && (contadorPorta1 == 1)) {
			ControleGeral.getSom().portaAbrindo();
			contadorPorta2=2;
			corredor.setVisible(false);
			ControleSala2.getSala2().getPersonagem().setAparencia(2);
			ControleSala2.getSala2().getPersonagem().setPosiX(16);
			ControleSala2.getSala2().setVisible(true);
		}
		if ((getCorredor().getPersonagem().getBounds().intersects(getCorredor()
				.getPorta3().getBounds())) && (contadorPorta1 == 1 && contadorPorta2 == 2)) {
			corredor.setVisible(false);
			
//			ControleTelaPergunta.getTela().setVisible(true);
//			ControleTelaPergunta.getRelogio().start();
			
			int num = (int) (Math.random()*11);
			ArrayList<Pergunta> perguntas = LeitorTXT.leitor();
			
	//		System.out.println("Tamanho: "+perguntas+" Numero Randomico: "+num);
			
			if (tp == null) {
				tp = new ControleTelaPergunta(new TelaPergunta(perguntas.get(num)));
		//		tp.getRelogio().start();
			}else {
				ControleCorredor.corredor.setVisible(false);
				tp.getTela().setVisible(true);
	//			tp.getRelogio().activeCount();
			}
			
			
			
		}
	}
	
	public static Corredor getCorredor() {
		return corredor;
	}
	
	public static void mudarPorta2() {
			corredor.getPorta2().setImagemC(corredor.getPorta1().getImagemC());
			corredor.getPorta2().setPosiY(93);
				
	}
	
	public static void mudarPorta3() {
		corredor.getPorta3().setImagemC(corredor.getPorta1().getImagemC());
		corredor.getPorta3().setPosiY(93);
	}
}