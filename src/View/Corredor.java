package View;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Model.Entidade;
import Model.Personagem;

public class Corredor extends TelaSalas {

	private ImageIcon background;
	private Personagem personagem;
	private Entidade porta1;
	private Entidade porta2;
	private Entidade porta3;
	

	public Corredor() {
			
			porta1 = new Entidade("portaAberta3.png", 110, 93, 80, 140);
			porta2 = new Entidade("portaBranco1.png", 383, 100, 69, 120);
			porta3 = new Entidade("portaBranco1.png", 640, 100, 69, 120);
			
			personagem = new Personagem("estudante.png",16, 150, 94, 94, 4, 4, 2);
			
			background = new ImageIcon("Imagens/CorredorCarnivoroHerbivero.png");
		//	repaint();
			
			setVisible(false);
	}

	public void paint(Graphics g1) {
		Graphics bbg = getGraphics();
		Graphics g = getGraphics();

		bbg.drawImage(this.background.getImage(), 0, 0, this);

		g.drawImage(porta1.getImagemC(), porta1.getPosiX(), porta1.getPosiY(), null);
		g.drawImage(porta2.getImagemC(), porta2.getPosiX(), porta2.getPosiY(), null);
		g.drawImage(porta3.getImagemC(), porta3.getPosiX(), porta3.getPosiY(), null);
		g.drawImage(personagem.getSprites()[personagem.getAparencia()],personagem.getPosiX(), personagem.getPosiY(), null);
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Entidade getPorta1() {
		return porta1;
	}

	public Entidade getPorta2() {
		return porta2;
	}

	public Entidade getPorta3() {
		return porta3;
	}
}
