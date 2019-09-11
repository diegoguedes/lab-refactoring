package collapseHierarchy;

import java.math.BigDecimal;

public abstract class Empregado {
	private String nome;
	private BigDecimal salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	abstract BigDecimal calcularSalario();
}
