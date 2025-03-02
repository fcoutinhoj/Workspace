package Aula01;
public class Caneta {
	
	private String modelo;
	private Float ponta;
	private boolean tampada;
	private String cor;

	//metodo construtor.
	public Caneta(String modelo , String cor, float ponta){
		this.setModelo(modelo);
		this.setCor(cor);
		this.setPonta(ponta);
		this.tampar();
	}	

	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Float getPonta() {
		return this.ponta;
	}
	public void setPonta(Float ponta) {
		this.ponta = ponta;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void status() {
		System.out.println("Sobre a caneta: ");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("cor: " + this.cor);	
		if (tampada == true) {
			System.out.println("tampada.");
		}else {
			System.out.println("destampada.");
		}
	}
	
}
