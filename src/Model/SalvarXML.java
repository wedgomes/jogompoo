package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import Controller.ControleTelaJogador;
import Controller.ControleTelaPergunta;

public class SalvarXML {

	public static void salvar(ArrayList<Jogador> jogadores){
		jogadores.add(new Jogador(ControleTelaJogador.getTelaJogador().getNomeField().getText(), ControleTelaPergunta.getTela().getAcerto()));
		
		File pontos = new File("Pontos.xml");
		
			try {
				PrintWriter xml = new PrintWriter(pontos);
				
				XStream xStream = new XStream(new DomDriver());
				
				for (Jogador jogador : jogadores) {
					xml.println("Nome: "+xStream.toXML(jogador.getNome()));
					xml.println("Pontos: "+xStream.toXML(jogador.getPontos()));
				}
				xml.flush();
				xml.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
