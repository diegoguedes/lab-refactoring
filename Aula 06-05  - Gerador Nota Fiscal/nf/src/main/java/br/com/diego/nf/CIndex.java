package br.com.diego.nf;

import java.util.ArrayList;

import org.zkoss.bind.AnnotateBinder;
import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zkplus.databind.DataBinder;
import org.zkoss.zul.Decimalbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;

public class CIndex extends GenericForwardComposer {
	private DataBinder binder;
	private Textbox txtbxNomeCliente;
	private Decimalbox dcmlbxValorFatura;
	private Radiogroup rdgrpTipoImposto;
	private Listbox lstbxNotaFiscal;
	private String str2;
	private ArrayList<NotaFiscal> listaNotaFiscal;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
		this.listaNotaFiscal = new ArrayList<NotaFiscal>();
		
		binder = new AnnotateDataBinder(comp);
		binder.loadAll();
	}

	public ArrayList<NotaFiscal> getListaNotaFiscal() {
		return listaNotaFiscal;
	}

	public void setListaNotaFiscal(ArrayList<NotaFiscal> listaNotaFiscal) {
		this.listaNotaFiscal = listaNotaFiscal;
	}

	public void onClick$btnGerarNotaFiscal() {
		Clients.showBusy("Gerando nota fiscal");
		Events.echoEvent("onGerarNotaFiscal", this.self, null);
	}

	public void onChange$txtGerarNotaFiscal() {
		Clients.showBusy("Gerando nota fiscal");
		Events.echoEvent("onGerarNotaFiscal", this.self, null);
	}

	public void onGerarNotaFiscal() {
		NotaFiscal notaFiscal;

		Fatura fatura = new Fatura(this.txtbxNomeCliente.getValue(), this.dcmlbxValorFatura.getValue().doubleValue());
		Imposto imposto;

		if (this.rdgrpTipoImposto.getSelectedItem().getValue().toString().compareTo("1") == 0) {
			imposto = new ISS();
		} else {
			imposto = new ICMS();
		}

		notaFiscal = new GeradorNotaFiscal().geraNota(fatura, imposto);

		this.listaNotaFiscal.add(notaFiscal);
		this.binder.loadComponent(this.lstbxNotaFiscal);
		this.lstbxNotaFiscal.setVisible(true);
		Clients.clearBusy();

		Messagebox.show("Nota Fiscal gerada com sucesso");
	}
}
