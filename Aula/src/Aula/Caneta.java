package Aula;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void rabiscar() {
		if (tampada == false) {
			System.out.println("Erro. Não posso rabiscar.");
		}else {
			System.out.println("Rabiscando.");
		}
		System.out.println(" ");
	}
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}
	
	void status() {
		System.out.println("Uma caneta modelo " + this.modelo);
		System.out.println("da cor " + this.cor);
		System.out.println("de ponta " + this.ponta);
		System.out.println("está com carga " + this.carga + "%");
		
		if (tampada == true) {
			System.out.println("está destampada. ");
		}else {
			System.out.println("está tampada.");
		}		
	
	}
	
}
