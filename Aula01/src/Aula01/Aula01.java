package Aula01;

//import java.util.Scanner;

public class Aula01 {
	public static void main(String[] args) {
		
		//Scanner s = new Scanner(System.in);
		
		//String modelo = null;
		//String cor = null;
		//float ponta = 0;
		
		//System.out.println("modelo: ");
		//modelo = s.next();
		//System.out.println("Cor: ");
		//cor = s.next();
		//System.out.println("ponta: ");
		//ponta = s.nextFloat();
				
		//Caneta c1 = new Caneta(modelo, cor, ponta);
		Caneta c1 = new Caneta("bic", "azul", 0.5f);

		//c1.setModelo("Bic");
		//c1.setPonta(0.5f);
		c1.status();
		
		//System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + " de cor " + c1.getCor() + " está " + c1.getTampada() );
		
		
	}

}
