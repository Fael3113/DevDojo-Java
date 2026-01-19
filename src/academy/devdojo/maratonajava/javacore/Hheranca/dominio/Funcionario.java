package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
	private double salario;

	static {
		System.out.println("Dentro do bloco inicialização estático de Funcionario");
	}
	{
		System.out.println("Dentro do bloco inicialização de Funcionario");
	}

	public Funcionario(String nome){
		super(nome);
		System.out.println("Dentro do construtor de funcionario");
	}

	@Override
	public void imprime() {
		super.imprime();
		System.out.println("R$ "+this.salario);
	}

	public void relatorioPagamento(){
		System.out.println(this.nome + " foi pago");
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
