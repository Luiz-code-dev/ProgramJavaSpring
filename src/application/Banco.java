package application;

public class Banco {
	
	
	public String nomeDados;
	public int quantidadeDados;
	public String modeloDados;
	public double precoDados;
	
	
	public Banco() {
		
	}
	
	public Banco(String nomeDados, int quantidadeDados, String modeloDados, double precoDados) {
		this.nomeDados = nomeDados;
		this.quantidadeDados = quantidadeDados;
		this.modeloDados = modeloDados;
		this.precoDados = precoDados;
	}

	public String getNomeDados() {
		return nomeDados;
	}

	public void setNomeDados(String nomeDados) {
		this.nomeDados = nomeDados;
	}

	public int getQuantidadeDados() {
		return quantidadeDados;
	}

	public void setQuantidadeDados(int quantidadeDados) {
		this.quantidadeDados = quantidadeDados;
	}

	public String getModeloDados() {
		return modeloDados;
	}

	public void setModeloDados(String modeloDados) {
		this.modeloDados = modeloDados;
	}

	public double getPrecoDados() {
		return precoDados;
	}

	public void setPrecoDados(double precoDados) {
		this.precoDados = precoDados;
	}
	
	
	
	
	
}
