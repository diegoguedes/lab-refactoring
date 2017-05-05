package extractMethod;

import java.util.ArrayList;

public class DividaFinal {
	private Pedidos pedidos;
	private String nome;

	void imprimeDivida() {
		imprimeCabecalho();
		double divida = calculaDividas();
		imprimeDetalhes(divida);
	}

	private void imprimeDetalhes(double divida) {
		// imprime detalhes
		System.out.println("nome: " + nome);
		System.out.println("divida total: " + divida);
	}

	private double calculaDividas() {
		// calcula dívidas
		double divida = 0.0;
		int i = 0;
		ArrayList<Itens> e = pedidos.getPedidos();
		while (i < e.size()) {
			Itens cada = (Itens) e.get(i);
			divida += cada.getValor();
		}
		return divida;
	}

	private void imprimeCabecalho() {
		// imprime cabeçalho
		System.out.println("***************************");
		System.out.println("*** Dívidas do Cliente ****");
		System.out.println("***************************");
	}
}
