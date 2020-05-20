package View;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Model.Entidade;
import Model.Personagem;

public class Sala2 extends TelaSalas {

	private ImageIcon background;
	private Personagem personagemSala2;
	private Entidade dino4;
	private Entidade dino3;
	private Entidade porta;
	private Entidade seguranca;

	public Sala2(Personagem personagem) {
		porta = new Entidade("portaBranco1.png", 650, 100, 69, 120);
		dino3 = new Entidade("PterodatioComPlaca.png", 150, 108, 200, 105);
		dino4 = new Entidade("EsqueletoRexComPlaca.png", 400, 108, 200, 100);
		seguranca = new Entidade("seguranca.png", 80, 50, 100, 180);

		this.personagemSala2 = personagem;
		
		background = new ImageIcon("Imagens/cenario1.png");

		setVisible(false);
	}

	public void paint(Graphics g2) {
		Graphics g = getGraphics();
		Graphics fundo = getGraphics();
		fundo.drawImage(this.background.getImage(), 0, 0, this);
		g.drawImage(seguranca.getImagemC(), seguranca.getPosiX(), seguranca.getPosiY(),null);
		g.drawImage(porta.getImagemC(), porta.getPosiX(), porta.getPosiY(),null);
		g.drawImage(dino3.getImagemC(), dino3.getPosiX(), dino3.getPosiY(),null);
		g.drawImage(dino4.getImagemC(), dino4.getPosiX(), dino4.getPosiY(),null);
		g.drawImage(personagemSala2.getSprites()[personagemSala2.getAparencia()],
				personagemSala2.getPosiX(), personagemSala2.getPosiY(), null);
	}

	public Entidade getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Entidade seguranca) {
		this.seguranca = seguranca;
	}

	public Personagem getPersonagem() {
		return personagemSala2;
	}

	public void setPersonagemSala2(Personagem personagemSala2) {
		this.personagemSala2 = personagemSala2;
	}

	public Entidade getDino4() {
		return dino4;
	}

	public Entidade getDino3() {
		return dino3;
	}

	public Entidade getPorta() {
		return porta;
	}
}