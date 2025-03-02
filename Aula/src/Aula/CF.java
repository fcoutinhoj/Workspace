package Aula;
public class CF {
	String modelo;
	String tamanho;
	boolean aberta;
	int quantidade;
	
	void abrir() {
		this.aberta = true;
	}
	
	void fechar() {
		this.aberta = false;
	}
	
	void riscar() {
		if (aberta == true) {
			System.out.println("Fósforo riscado.");
		}else {
			System.out.println("Não pode riscar. ");
		}
	}
	
	void status() {
		System.out.println(" ");
		System.out.println("Uma caixa de fósforos modelo " + this.modelo);
		System.out.println("de tamanho " + this.tamanho);
		
		if (aberta == true) {
			System.out.println("está aberta");
		}else {
			System.out.println("está fechada");
		}
		
		
		if (aberta == true) {
			System.out.println("Pode riscar. ");
		}else {
			System.out.println("Erro. Está fechada. ");
		}
		
	}
}
