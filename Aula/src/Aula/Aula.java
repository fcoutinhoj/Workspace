package Aula;

import java.util.Date;

public class Aula {
	public static void main(String[] args) {
		
		//Pega a data e hora do sistema.
		Date hora = new Date();		
		System.out.println(hora);
		System.out.println(" ");
		
		
		//instanciar objeto.
		Caneta c1 = new Caneta();
		Caneta c2 = new Caneta();
		CF cx1 = new CF(); //CF está maiusculo, pois refere-se à Caixa de Fósforo. 
		CF cx2 = new CF();
		
		
		//preencher atributos.
		c1.modelo = "Bic";
		c1.cor = "azul";
		//c1.ponta = 0.5f;
		c1.carga = 100;
		//c1.tampada = false;
		
		c2.modelo = "coudev";
		c2.cor = "preta";
		//c2.ponta = 1;
		c2.carga = 50;
		//c2.tampada = true;
		
		cx1.modelo = "fiatLux";
		cx1.quantidade = 100;
		cx1.tamanho = "Pequena";
		
		cx2.modelo = "Queluz";
		cx2.quantidade = 50;
		cx2.tamanho = "Pequena";
		
		//chamada de metodos.
		c1.destampar();
		//c1.tampar();
		c1.status();
		c1.rabiscar();
		
		c2.tampar();
		c2.status();
		c2.rabiscar();
		
		cx1.fechar();
		cx1.status();
		cx1.riscar();
		
		cx2.abrir();
		cx2.status();
		cx2.riscar();
		
	}
}
