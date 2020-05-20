package Controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Model.Personagem;
import View.Sala2;

public class ControleSala2 {

	private static Sala2 sala2;
	private int colisao = 0;

	public ControleSala2(Personagem personagem) {
		sala2 = new Sala2(personagem);
		sala2.addKeyListener(new TAdapter());
	}

	public class TAdapter extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				getSala2().getPersonagem().andarLefth();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				getSala2().getPersonagem().andarRigth();
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				getSala2().getPersonagem().andarUp();
				checarColisao();

			}
			if (getSala2().getPersonagem().getPosiX() < -21) {
				getSala2().getPersonagem().setPosiX(-21);
			}
			if (getSala2().getPersonagem().getPosiX() > 720) {
				getSala2().getPersonagem().setPosiX(720);
			}
			getSala2().repaint();
		}
	}

	public void checarColisao() {
		if ((getSala2().getPersonagem().getBounds().intersects(getSala2()
				.getDino3().getBounds()))) {
//			new ControlerInfo3(new InformativoPterodactilo()).contInfo3();
//			inforP.setVisible(true);
			sala2.getSeguranca().setPosiX(330);
			colisao++;
				if(colisao >= 2) {
					sala2.getPorta().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
					sala2.getPorta().setPosiY(93);
				}
			ControleInfo3.getInfoPiter().setVisible(true);
			
		}
		if ((getSala2().getPersonagem().getBounds().intersects(getSala2()
				.getDino4().getBounds()))) {
//			new ControleInfo4(new InformativoRex()).contInfo4();
//			inforR.setVisible(true);
			colisao++;
				if(colisao >= 2) {
					sala2.getPorta().setImagemC(ControleCorredor.getCorredor().getPorta1().getImagemC());
					sala2.getPorta().setPosiY(93);
				}
			ControleInfo4.getInfoRex().setVisible(true);
		}
		if ((getSala2().getPersonagem().getBounds().intersects(getSala2()
				.getPorta().getBounds())) && (colisao >= 2)) {
			sala2.getSeguranca().setPosiX(80);
			ControleGeral.getSom().portaAbrindo();
//			getSala2().dispose();
//			new ControleCorredor().getCorredor().getPersonagem().setPosiX(360);
			sala2.setVisible(false);
//			corredor.setVisible(true);
			ControleCorredor.mudarPorta3();
			ControleCorredor.getCorredor().getPersonagem().setPosiX(360);
			ControleCorredor.getCorredor().getPersonagem().setAparencia(2);
			ControleCorredor.getCorredor().setVisible(true);
		}
	}

	public static Sala2 getSala2() {
		return sala2;
	}
}