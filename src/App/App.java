package App;
import java.util.ArrayList;

import Controller.ControleGeral;
import Controller.ControleTelaPergunta;
import Model.Jogador;
import View.TelaPergunta;

public class App {	
	
	public static ArrayList<Jogador> jogador= new ArrayList<Jogador>();
	
	public static void main(String[] args) {
		
		new ControleGeral();
	}	
}
