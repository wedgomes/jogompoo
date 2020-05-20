//package Controller;
//
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//
//import javax.imageio.ImageIO;
//import javax.swing.JFileChooser;
//import javax.swing.JOptionPane;
//import javax.swing.filechooser.FileNameExtensionFilter;
//
//import View.CriarPergunta;
//
//public class ControleCriarPergunta implements ItemListener{
//
//	static CriarPergunta criarPergunta;
//	private static int qntPerguntas = 10;
//	private String urlArquivo;
//	
//	public ControleCriarPergunta() {
//		criarPergunta = new CriarPergunta();
//
//		criarPergunta.getImgRadio().addItemListener(this);
//		
//		criarPergunta.getVoltar().addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				criarPergunta.getAltLabel2().setVisible(false);
//				criarPergunta.getAltField2().setVisible(false);
//				
//				criarPergunta.getAltLabel3().setVisible(false);
//				criarPergunta.getAltField3().setVisible(false);
//				
//				criarPergunta.setVisible(false);
//				ControleMenu.getMenu().setVisible(true);
//
//			}
//		});
//
//		criarPergunta.getCadastrar().addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
////				try {
//////					if(escreverArquivo(criarPergunta.getTextArea().getText())){
//////						setQntPerguntas(getQntPerguntas()+1);
//////					}
////				} catch (IOException e) {
////					e.printStackTrace();
////				}
//			}
//		});
//		
//		criarPergunta.getAdd().addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) {
//				if(e.getClickCount() == 1){
//					criarPergunta.getAltLabel2().setVisible(true);
//					criarPergunta.getAltField2().setVisible(true);
//				}
//				else {
//					criarPergunta.getAltLabel3().setVisible(true);
//					criarPergunta.getAltField3().setVisible(true);
//				}
//				
//			}
//		});
//	}
//
//	public boolean escreverArquivo(String novaPergunta) throws IOException {
//		OutputStream os = new FileOutputStream("perguntas.txt", true);
//
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//
//		BufferedWriter bw = new BufferedWriter(osw);
//
//		bw.newLine();
//
//		bw.append("\n" + novaPergunta);
//
//		bw.close();
//		
//		return true;
//	}
//
//	public static int getQntPerguntas() {
//		return qntPerguntas;
//	}
//
//	public static void setQntPerguntas(int qntPerguntas) {
//		ControleCriarPergunta.qntPerguntas = qntPerguntas;
//	}
//
//	@Override
//	public void itemStateChanged(ItemEvent e) {
//		if(criarPergunta.getImgRadio().isSelected()){
////			JFileChooser fc = new JFileChooser();
////			fc.setVisible(true);
////			
////            int res = fc.showOpenDialog(null);
////            
////            if(res == JFileChooser.APPROVE_OPTION){
////                File arquivo = fc.getSelectedFile();  
////                JOptionPane.showMessageDialog(null, "Voce escolheu o arquivo: " + arquivo.getName());
////            }
////            else
////                JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo."); 
//			carregarImagem();
////        
//		}
//	}	
//	
//	public void carregarImagem(){         //pega o endereço da imagem
//		FileNameExtensionFilter filtro = new FileNameExtensionFilter("imagens (.png)", "png");  //define o tipo do quevai buscar
//		String diretorioBase = System.getProperty("user.home")+"/Desktop"; //local onde a janela iniciara
//		File dir  = new File(diretorioBase);
//		JFileChooser chooseImg = new JFileChooser();                         // janela para captura do endereco
//		
//		chooseImg.setCurrentDirectory(dir);
//		chooseImg.setFileSelectionMode(JFileChooser.FILES_ONLY);     // confitura para selecionar arquivos
//		chooseImg.setAcceptAllFileFilterUsed(false);        //permtir mair de um arquivo
//		chooseImg.addChoosableFileFilter(filtro);			//ad filtro de pto
//		
//		int retorno = chooseImg.showOpenDialog(null);     
//		if(retorno== JFileChooser.APPROVE_OPTION){
//			urlArquivo = chooseImg.getSelectedFile().getAbsolutePath();    // captura o endereco   
//		}
//	}
//	
//
//	public void copyImg(){
//		
//		
//		try {
//		Image	imagemProvisoria = ImageIO.read(new File(urlArquivo));    // carrega o  arquivo passando o endereco selecionado
//			
//	//			ImageIO.write(imagemProvisoria, "PNG", new File(("ImagensPerguntas/"+tela.getRespostaField().getText()+".png")));  // salva a imagem no endereço do File
//	
//			
//			
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
////	public static String retornarEnderecoPasta(){
////
////	    JFileChooser chooser = new JFileChooser();
////	    chooser.setCurrentDirectory(new java.io.File("."));
////	    chooser.setDialogTitle("choosertitle");
////	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
////	    chooser.setAcceptAllFileFilterUsed(false);
////	    
////	    String tmp = null;
////	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
////	    	  tmp=chooser.getSelectedFile().toURI().normalize().getPath();
////		
////	    } else {
////	      System.out.println("No Selection ");
////	    }
////	    
////	    return tmp;
////	}
//}
