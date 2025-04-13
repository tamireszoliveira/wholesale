package model;

public class Cliente {

	private String nome;
	private int qp;
	private float vp;
	
	public Cliente(String nome, int qp, float vp) {
		this.nome = nome;
		this.qp = qp;
		this.vp = vp;
		
	}

	public String getNome() {
		return nome;
	}

	public int getQp() {
		return qp;
	}

	public float getVp() {
		return vp;
	}

}
