package dev.rafael.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
	//protected é usado a que a variavel seja acessada apenas pelo pacote ou se for uma subclasse herdeira
	protected String nome;
	protected String cin;
	protected Endereco endereco;

	static {
		System.out.println("Dentro do bloco inicialização estático de pessoa");
	}
	{
		System.out.println("Dentro do bloco inicialização de pessoa");
	}
	public Pessoa(String nome){
		System.out.println("Dentro do construtor de pessoa");
		this.nome = nome;
	}

	public void imprime(){
		System.out.println(this.nome);
		System.out.println(this.cin);
		System.out.println(this.endereco.getRua()+ " "+ this.endereco.getCep());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
