package pullUpConstructorBody;

public class PessoaFinal {
	String nome;
	String endereco;
	int idade;

	public PessoaFinal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public PessoaFinal(String nome, int idade, String endereco) {
		this(nome,idade);
		this.endereco = endereco;
	}
}
