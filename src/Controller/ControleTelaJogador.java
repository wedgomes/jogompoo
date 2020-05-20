package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.Personagem;
import View.TelaJogador;

public class ControleTelaJogador {

	private static TelaJogador telaJogador;
	private static Personagem personagem;

	public ControleTelaJogador(){
		telaJogador = new TelaJogador();
		
		
		telaJogador.getConfirmar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(telaJogador.getPlay1().isSelected() && !telaJogador.getNomeField().getText().equals("")){
					
					personagem = new Personagem("estudante.png",16, 150, 94, 94, 4, 4, 2);
					
					
					ControleCorredor.getCorredor().setPersonagem(personagem);
					ControleSala1.getSala1().setPersonagemSala1(personagem);
					ControleSala2.getSala2().setPersonagemSala2(personagem);
					
					telaJogador.setVisible(false);
					
					ControleCorredor.getCorredor().setVisible(true);
					
				}else if(telaJogador.getPlay2().isSelected() && !telaJogador.getNomeField().getText().equals("")){
					personagem = new Personagem("menina.png",16, 150, 94, 94, 4, 4, 2);
					
					
					ControleCorredor.getCorredor().setPersonagem(personagem);
					ControleSala1.getSala1().setPersonagemSala1(personagem);
					ControleSala2.getSala2().setPersonagemSala2(personagem);
					
					telaJogador.setVisible(false);
					
					ControleCorredor.getCorredor().setVisible(true);
					
				}
				else if(telaJogador.getNomeField().getText().equals("") || (!telaJogador.getPlay1().isSelected() || !telaJogador.getPlay2().isSelected())){
					JOptionPane.showMessageDialog(null, "Verifique seu nome ou sua opção de avatar!!");
				}
				ControleGeral.getSom().abertuarParar();
			}	
		});
	}
	
	public static TelaJogador getTelaJogador() {
		return telaJogador;
	}
	
	public static Personagem getPersonagem() {
		return personagem;
	}
}
