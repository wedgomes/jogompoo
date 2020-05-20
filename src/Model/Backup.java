package Model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

import App.App;
import Controller.ControleTelaJogador;
import Controller.ControleTelaPergunta;

public class Backup {

	private final static String CAMPO_NOME = "nome";
	private final static String CAMPO_PONTUACAO = "pontuacao";
	private final static String CAMPO_PLACAR="Placar";
	
	public static void salvarXML(){
		App.jogador.add(new Jogador(ControleTelaJogador.getTelaJogador().getNomeField().getText(), ControleTelaPergunta.getTela().getAcerto()));
		
		Element placar = new Element(CAMPO_PLACAR);
		
		Document documento = new Document(placar);
		
		Element nome = new Element(CAMPO_NOME);
	//	nome.setText(App.jogador.get(0).getNome());
		
		Element pontuacao = new Element(CAMPO_PONTUACAO);
//		pontuacao.setText(Integer.toString(App.jogador.get(0).getPontos()));
//		nome.addContent(pontuacao);
		
		for(Jogador jogador:App.jogador){
			nome.setText(jogador.getNome());
			pontuacao.setText(Integer.toString(jogador.getPontos()));
		}
		
		nome.addContent(pontuacao);
		placar.addContent(nome);
		
		XMLOutputter xout = new XMLOutputter();

		OutputStream out = null;
		
		try {
			out = new FileOutputStream(new File("melhorPontuacao.xml")); 
			xout.output(documento, out); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
