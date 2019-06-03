package model;

public class PessoaFisica extends Pessoa {
	
	// ENXTEND_ comando de herança.
	
	//CPF
	
	private long cpf;
	public long getcpf() {
	return cpf;
	}
	public void setcpf(long cpf) {
	this.cpf = cpf;
	}

	//ENDEREÇO
	
	private long endereco;
	public long getendereco() {
	return endereco;
	}
	public void setendereco(long endereco) {
	this.endereco = endereco;
	}
	
	//BAIRRO
	
	private long bairro;
	public long getbairro() {
	return bairro;
	}
	public void setbairro(long bairro) {
	this.bairro = bairro;
	}
	
	
	//CIDADE
	
	private long cidade;
	public long getcidade() {
	return cidade;
	}
	public void setcidade(long cidade) {
	this.cidade = cidade;
	}
	
	//ESTADO
	
	private long estado;
	public long getestado() {
	return estado;
	}
	public void setestado(long estado) {
	this.estado = estado;
	}
}


