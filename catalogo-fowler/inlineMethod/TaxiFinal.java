package inlineMethod;

public class TaxiFinal {

	int bandeiradaDoTaxi(int hora) {
		return (depoisDas22Horas(hora) ? 2 : 1);
	}

	public boolean depoisDas22Horas(int hora) {
		return hora > 22;
	}

}
