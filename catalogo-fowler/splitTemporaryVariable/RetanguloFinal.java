
package splitTemporaryVariable;

public class RetanguloFinal {
	private double altura;
	private double largura;

	public void calcular() {
		double perimetro = 2 * (altura + largura);
		System.out.println(perimetro);
		double area = altura * largura;
		System.out.println(area);
	}
}
