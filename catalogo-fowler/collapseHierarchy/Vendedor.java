package collapseHierarchy;

import java.math.BigDecimal;

public class Vendedor extends Empregado{
	private BigDecimal comissao;
	
	public BigDecimal calcularSalario() {		
		return this.getSalario().add(comissao);
		
	}
}
