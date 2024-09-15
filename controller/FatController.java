package controller;
import georgethiago.pilhaint.Pilha;

public class FatController {
	
	public FatController() {
		super();
	}
	
	public long fatorial(int num) {
		Pilha p = new Pilha ();
		int resul = num; 
		
		for(int i = 1; i <= num; i++) {
			p.push(i);
		}
		
		for(int i = 1; i < num; i++) {
			try {
				p.pop();
				resul = resul * p.top();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resul;
	}
}

