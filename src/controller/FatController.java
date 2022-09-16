package controller;

import br.com.leandrocolevati.pilhalong.Pilha;

public class FatController {
	
	
	public long fatorial(int valor) {
		Pilha pilha = new Pilha();
		int result = 1;
		
		for(int i = 0; i < valor; i++) {
			pilha.push(valor-i);
		}
		
		while (pilha.size() > 0) {
			try {
				result *= (int) pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return result;
		
	}

}
