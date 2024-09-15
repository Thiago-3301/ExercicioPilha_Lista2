package view;
import javax.swing.JOptionPane;
import controller.FatController;

public class Principal {
	public static void main(String[] args) {
		FatController fat = new FatController();
		
		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 10 para calcular o fatorial"));
		}while(num < 0 || num > 10);
		
		System.out.println("O fatorial de " + num + " é " + fat.fatorial(num));
	}
	
	
	
	

}
