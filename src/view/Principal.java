package view;

import javax.swing.JOptionPane;

import br.com.leandrocolevati.pilhalong.Pilha;
import controller.FatController;

public class Principal {
	
	public static void main(String[] args) {
		int numero = -1;
		while(numero > 20 || numero < 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		}
		FatController fc = new FatController();
		System.out.println("fatorial: "+fc.fatorial(numero));
	}
	
	
	

}
