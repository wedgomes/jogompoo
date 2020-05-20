package View;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TelaJogador extends JFrame{

	private JLabel nomeLabel, fundoLabel, p1, p2;
	private  JTextField nomeField;
	private JButton confirmar;
	private JRadioButton play1, play2;
	private ButtonGroup bg;
	
	public TelaJogador() {
		super("Jogador");
		
		ImageIcon icone = new ImageIcon("Imagens/icone.png");
		setIconImage(icone.getImage());
		
		fundoLabel = new JLabel(new ImageIcon("Imagens/telaJ.png"));
		fundoLabel.setBounds(0, 0, 500, 333);
		
		p1 = new JLabel(new ImageIcon("Imagens/p1.png"));
		p1.setBounds(85, 140, 99, 95);
		
		p2 = new JLabel(new ImageIcon("Imagens/p2.png"));
		p2.setBounds(170, 140, 94, 98);
		
		play1 = new JRadioButton("MENINO", false);
		play1.setBounds(85, 120, 85, 20);
		
		play2 = new JRadioButton("MENINA", false);
		play2.setBounds(175, 120, 80, 20);
		
		nomeLabel = new JLabel("NOME:");
		nomeLabel.setBounds(100, 240, 80, 60);
		
		nomeField = new JTextField(10);
		nomeField.setBounds(140, 260, 90, 20);
		
		confirmar = new JButton("Ok");
		confirmar.setIcon(new ImageIcon("Imagens/continuar1.png"));
		confirmar.setContentAreaFilled(false);
		confirmar.setBounds(400, 260, 50, 50);
		
		bg = new ButtonGroup();
		bg.add(play1);
		bg.add(play2);
		
		add(nomeLabel);
		add(nomeField);
		add(confirmar);
		add(play1);
		add(play2);
		add(p1);
		add(p2);
		add(fundoLabel);
		
		setSize(500, 333);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setVisible(false);
	}
	

	public ButtonGroup getBg() {
		return bg;
	}


	public void setBg(ButtonGroup bg) {
		this.bg = bg;
	}


	public  JTextField getNomeField() {
		return nomeField;
	}

	public JButton getConfirmar() {
		return confirmar;
	}

	public JRadioButton getPlay1() {
		return play1;
	}

	public JRadioButton getPlay2() {
		return play2;
	}

	public JLabel getP1() {
		return p1;
	}

	public void setP1(JLabel p1) {
		this.p1 = p1;
	}

	public JLabel getP2() {
		return p2;
	}

	public void setP2(JLabel p2) {
		this.p2 = p2;
	}
}
