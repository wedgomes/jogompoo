package View;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Controller.ControleTelaPergunta;
import Model.Pergunta;

public class TelaPergunta extends JFrame {
	public final static int NUMERO_DE_ALTERNATIVAS = 3;

	private JLabel labelTextoPergunta, fundo, acertosLabel, errosLabel, tempoLabel, comprarLabel;
	private JButton[] opcoes;
	private JLabel sairLabel;
	private Pergunta pergunta;
	private int acerto, errou;
	private Font fontes;

	public TelaPergunta(Pergunta pergunta) {
		setSize(500, 347);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setUndecorated(true);

		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		this.pergunta = pergunta;

		this.acerto = 0;
		this.errou = 0;
		
		labelTextoPergunta = new JLabel(pergunta.getTextoPergunta());
		labelTextoPergunta.setFont(new Font("Arial Black", Font.CENTER_BASELINE, 12));

		fontes = new Font("Stencil", Font.CENTER_BASELINE, 16);
		
		tempoLabel = new JLabel();
		tempoLabel.setFont(new Font("Stencil", Font.CENTER_BASELINE, 30));
		
		fundo = new JLabel(new ImageIcon("Imagens/QUIZ.png"));
		fundo.setBounds(0, 0, 500, 357);
		
		acertosLabel = new JLabel("Acertos: " + getAcerto());
		acertosLabel.setFont(fontes);
		errosLabel = new JLabel("Erros: " + getErrou());
		errosLabel.setFont(fontes);
		
		ImageIcon sairImagem = new ImageIcon("Imagens//voltarT.png");
		sairLabel = new JLabel(sairImagem);
		sairLabel.setToolTipText("Voltar Para o Museu");
		sairLabel.setBounds(320, 250, 220, 100);
		
		ImageIcon comprar = new ImageIcon("Imagens//comprar.png");
		comprarLabel = new JLabel(comprar);
		comprarLabel.setToolTipText("Comprar Informações");
		comprarLabel.setBounds(320, 250, 220, 90);

		opcoes = new JButton[NUMERO_DE_ALTERNATIVAS];
		
		opcoes[0] = new JButton(pergunta.getAlternativas()[0]);
		opcoes[0].setContentAreaFilled(false);
		opcoes[1] = new JButton(pergunta.getAlternativas()[1]);
		opcoes[1].setContentAreaFilled(false);
		opcoes[2] = new JButton(pergunta.getAlternativas()[2]);
		opcoes[2].setContentAreaFilled(false);

		labelTextoPergunta.setBounds(70, 100, 420, 50);

		opcoes[0].setBounds(100, 160, 300, 17);
		opcoes[1].setBounds(100, 180, 300, 17);
		opcoes[2].setBounds(100, 200, 300, 17);

		acertosLabel.setBounds(200, 240, 300, 17);
		errosLabel.setBounds(200, 260, 300, 17);
		
		tempoLabel.setBounds(390, 70, 300, 30);
		
		sairLabel.setBounds(100, 250, 80, 50);

		add(labelTextoPergunta);
		add(opcoes[0]);
		add(opcoes[1]);
		add(opcoes[2]);
		add(acertosLabel);
		add(errosLabel);
		add(tempoLabel);
		add(sairLabel);
		add(comprarLabel);
		add(fundo);

		setVisible(true);
	}
	
	public void atualizar(Pergunta pergunta){
		labelTextoPergunta.setText(pergunta.getTextoPergunta());
		for (int i = 0; i < opcoes.length; i++) {
			opcoes[i].setText(pergunta.getAlternativas()[i]);
		}
		getPergunta().setResposta(pergunta.getResposta());
	}

	public JButton[] getOpções() {
		return opcoes;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public int getAcerto() {
		return acerto;
	}

	public void setAcerto(int acertoP) {
		this.acerto += acertoP;
		acertosLabel.setText("Acertos: "+acerto);
	}

	public int getErrou() {
		return errou;
	}

	public void setErrou(int errouP) {
		this.errou += errouP;
		errosLabel.setText("Erros: "+errou);
	}

	public void setAcertosLabel(JLabel acertosLabel) {
		this.acertosLabel = acertosLabel;
	}

	public void setErrosLabel(JLabel errosLabel) {
		this.errosLabel = errosLabel;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}

	public JLabel getSairLabel() {
		return sairLabel;
	}

	public void setTempoLabel(JLabel tempoLabel) {
		this.tempoLabel = tempoLabel;
	}

	public JLabel getTempoLabel() {
		return tempoLabel;
	}

	public JLabel getComprarLabel() {
		return comprarLabel;
	}

	public void setComprarLabel(JLabel comprarLabel) {
		this.comprarLabel = comprarLabel;
	}
	
}
