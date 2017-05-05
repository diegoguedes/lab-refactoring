package replaceTempWithQuery;

public class ProdutoFinal {
	private int quantidade;
	private int precoItem;

	double getPreco() {
		double fatorDesconto;
		if (precoBase() > 1000)
			fatorDesconto = 0.95;
		else
			fatorDesconto = 0.98;
		return precoBase() * fatorDesconto;
	}

	private int precoBase() {
		return quantidade * precoItem;
	}
}
