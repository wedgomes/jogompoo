package View;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Model.Entidade;
import Model.Personagem;

public class Sala1 extends TelaSalas {

	private ImageIcon background;
	private Personagem personagemSala1;
	private Entidade dino1;
	private Entidade dino2;
	private Entidade porta;
	private Entidade seguranca;

	public Sala1(Personagem personagem) {
		
		dino1 = new Entidade("StegossauroComPlaca.png", 180, 130, 200, 105);
		dino2 = new Entidade("TitanossauroComPlaca.png", 430, 130, 200, 100);
		porta = new Entidade("portaBranco1.png", 650, 100, 69, 120);
		seguranca = new Entidade("seguranca.png", 80, 50, 100, 180);
	
		this.personagemSala1 = personagem;
		
		background = new ImageIcon("Imagens/cenario1.png");

		setVisible(false);
	}

	public void paint(Graphics g1) {
		Graphics g = getGraphics();
		Graphics bbg = getGraphics();
		bbg.drawImage(this.background.getImage(), 0, 0, this);
		g.drawImage(seguranca.getImagemC(), seguranca.getPosiX(), seguranca.getPosiY(),null);
		g.drawImage(porta.getImagemC(), porta.getPosiX(), porta.getPosiY(),null);
		g.drawImage(dino1.getImagemC(), dino1.getPosiX(), dino1.getPosiY(),null);
		g.drawImage(dino2.getImagemC(), dino2.getPosiX(), dino2.getPosiY(),null);
		g.drawImage(personagemSala1.getSprites()[personagemSala1.getAparencia()],
				personagemSala1.getPosiX(), personagemSala1.getPosiY(), null);
	}

	public Entidade getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Entidade seguranca) {
		this.seguranca = seguranca;
	}

	public Personagem getPersonagem() {
		return personagemSala1;
	}
	
	public void setPersonagemSala1(Personagem personagemSala1) {
		this.personagemSala1 = personagemSala1;
	}

	public Entidade getDino1() {
		return dino1;
	}

	public Entidade getDino2() {
		return dino2;
	}

	public Entidade getPorta() {
		return porta;
	}
}