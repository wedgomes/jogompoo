//package View;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//
//import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class CriarPergunta extends JFrame {
//
//	//private JTextArea textArea;
//	private JRadioButton textoRadio, imgRadio, herbiveroRadio, carnivroRadio;
//	private ButtonGroup bg;
//	private JButton cadastrar, voltar, add;
//	private JLabel temaLabel, resumoLabel, perguntaLabel, altLabel1, altLabel2, altLabel3;
//	private JTextField temaField, perguntaField, altField1, altField2, altField3;
//	private JTextArea areaResumo;
//	//	private JLabel fundo;
//	
//	public CriarPergunta() {
////		temaLabel = new JLabel("Tema:");
////		temaLabel.setBounds(30, 20, 50, 60);
//
//		herbiveroRadio = new JRadioButton("Hérbivero");
//		herbiveroRadio.setBounds(30, 20, 50, 60);
//		
//		
////		temaField = new JTextField(20);
////		temaField.setBounds(70, 40, 300, 20);
//		
//		resumoLabel = new JLabel("Resumo:");
//		resumoLabel.setBounds(200, 45, 50, 60);
//		
//		areaResumo = new JTextArea();
//		areaResumo.setBounds(70,85,300,100);
//		
//		textoRadio = new JRadioButton("Texto", true);
//		textoRadio.setBounds(80, 185, 60, 50);
//		
//		imgRadio = new JRadioButton("Imagem", false);
//		imgRadio.setBounds(180, 185, 80, 50);
//		
//		perguntaLabel = new JLabel("Pergunta:");
//		perguntaLabel.setBounds(30, 220, 70, 50);
//		
//		perguntaField = new JTextField(20);
//		perguntaField.setBounds(90, 235, 280, 20);
//		
//		altLabel1 = new JLabel("Alternativa 1:");
//		altLabel1.setBounds(30, 250, 80, 50);
//		
//		altField1 = new JTextField(15);
//		altField1.setBounds(110, 265, 250, 20);
//		
//		altLabel2 = new JLabel("Alternativa 2:");
//		altLabel2.setBounds(30, 285, 80, 20);
//		
//		altField2 = new JTextField(15);
//		altField2.setBounds(110, 290, 250, 20);
//		
//		altLabel3 = new JLabel("Alternativa 3:");
//		altLabel3.setBounds(30, 305, 80, 20);
//		
//		altField3 = new JTextField(15);
//		altField3.setBounds(110, 315, 250, 20);
//		
//		
//		bg = new ButtonGroup();
//		bg.add(textoRadio);
//		bg.add(imgRadio);
//		
//		ImageIcon icone = new ImageIcon("Imagens/icone.png");
//		setIconImage(icone.getImage());
//
////		fundo = new JLabel(new ImageIcon("Imagens/imgTelaP.png"));
////		fundo.setBounds(0, 0, 500, 333);
//		
//		cadastrar = new JButton("Cadastrar");
//		cadastrar.setBounds(30, 350, 100, 30);
//		
//		voltar = new JButton("Voltar");
//		voltar.setBounds(150, 350, 70, 30);
//		
//		add = new JButton("+");
//		add.setBounds(300, 350, 50, 30);
//
////		textArea = new JTextArea("	MODELO DE PERGUNTA EM TEXTO "
////				+ "\n\nPERGUNTA \nALTERNATIVA 1 \nALTERNATIVA 2 \nALTERNATIVA 3 \nRESPOSTA "
////				+ "\n OBS.: A resposta deverá ser o número correspondente a alternativa. "
////				+ "\n Ex: Letra a = 1, b = 2, c = 3.");
////		
////		textArea.setForeground(Color.BLUE);
////		textArea.setBounds(40,20,300,150);
//	
////		cadastrar.setBounds(120,200,100,100);
////
////		voltar.setBounds(270,200,100,100);
//		
//	//	add(textArea);
////		add(temaLabel);
////		add(temaField);
//		add(herbiveroRadio);
//		add(resumoLabel);
//		add(areaResumo);
//		add(textoRadio);
//		add(imgRadio);
//		add(perguntaLabel);
//		add(perguntaField);
//		add(altLabel1);
//		add(altField1);
//		add(altLabel2).setVisible(false);
//		add(altField2).setVisible(false);
//		add(altLabel3).setVisible(false);
//		add(altField3).setVisible(false);
//		add(add);
//		add(voltar);
//		add(cadastrar);
////		add(fundo);
//
//		setSize(400, 400);
//		setLayout(null);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		setUndecorated(true);
//		setVisible(false);
//	}
//
////	public JTextArea getTextArea() {
////		return textArea;
////	}
////
////	public void setTextArea(JTextArea textArea) {
////		this.textArea = textArea;
////	}
//
//	public JButton getCadastrar() {
//		return cadastrar;
//	}
//
//	public void setCadastrar(JButton cadastrar) {
//		this.cadastrar = cadastrar;
//	}
//
//	public JButton getVoltar() {
//		return voltar;
//	}
//
//	public void setVoltar(JButton voltar) {
//		this.voltar = voltar;
//	}
//
//	public JTextArea getAreaResumo() {
//		return areaResumo;
//	}
//
//	public void setAreaResumo(JTextArea areaResumo) {
//		this.areaResumo = areaResumo;
//	}
//
//	public JRadioButton getTextoRadio() {
//		return textoRadio;
//	}
//
//	public JRadioButton getImgRadio() {
//		return imgRadio;
//	}
//
//	public JButton getAdd() {
//		return add;
//	}
//
//	public JLabel getAltLabel1() {
//		return altLabel1;
//	}
//
//	public JLabel getAltLabel2() {
//		return altLabel2;
//	}
//
//	public JLabel getAltLabel3() {
//		return altLabel3;
//	}
//
//	public JTextField getTemaField() {
//		return temaField;
//	}
//
//	public JTextField getPerguntaField() {
//		return perguntaField;
//	}
//
//	public JTextField getAltField1() {
//		return altField1;
//	}
//
//	public JTextField getAltField2() {
//		return altField2;
//	}
//
//	public JTextField getAltField3() {
//		return altField3;
//	}
//}
