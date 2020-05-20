package View;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.ControleGeral;
import Model.Som;

public class Menu extends JFrame {

	 private JLabel fundo;
	 private JLabel jogarLabel, creditosLabel,  ajudaLabel, sairLabel;
	 ImageIcon img1;
	 
	public Menu() {
		super("Menu");
		setSize(500, 333);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);

		ControleGeral.getSom().aberturaSom();
		
		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		fundo = new JLabel(new ImageIcon("Imagens//museuMenu1.png"));
		fundo.setBounds(0, 0, 500, 333);

		img1 = new ImageIcon("Imagens//jogar.png");
		jogarLabel = new JLabel(img1);
		jogarLabel.setBounds(200, 226, 98, 20);
		
		
		ImageIcon img2 = new ImageIcon("Imagens//creditos.png");
		creditosLabel = new JLabel(img2);
		creditosLabel.setBounds(201, 255, 96, 16);

		ImageIcon img4 = new ImageIcon("Imagens//ajuda.png");
		ajudaLabel = new JLabel(img4);
		ajudaLabel.setBounds(203, 280, 95, 22);
		
		ImageIcon img3 = new ImageIcon("Imagens//sair.png");
		sairLabel = new JLabel(img3);
		sairLabel.setBounds(200, 295, 95, 50);

		add(jogarLabel);
	//	add(criarPerguntaLabel);
		add(creditosLabel);
		add(ajudaLabel);
		add(sairLabel);
		add(fundo);


		setVisible(true);
	}	
	
	public JLabel getAjudaLabel() {
		return ajudaLabel;
	}



	public void setAjudaLabel(JLabel ajudaLabel) {
		this.ajudaLabel = ajudaLabel;
	}



	public ImageIcon getImg1() {
		return img1;
	}



	public void setImg1(ImageIcon img1) {
		this.img1 = img1;
	}



	public JLabel getJogarLabel() {
		return jogarLabel;
	}

	public void setJogarLabel(JLabel jogarLabel) {
		this.jogarLabel = jogarLabel;
	}

	public JLabel getCreditosLabel() {
		return creditosLabel;
	}

	public void setCreditosLabel(JLabel creditosLabel) {
		this.creditosLabel = creditosLabel;
	}

	public JLabel getSairLabel() {
		return sairLabel;
	}

	public void setSairLabel(JLabel sairLabel) {
		this.sairLabel = sairLabel;
	}
	
}
