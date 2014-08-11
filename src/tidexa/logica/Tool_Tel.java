package tidexa.logica;

import java.util.ArrayList;
import tidexa.model.Telefone;

public class Tool_Tel {
	private Telefone tel;

	public Tool_Tel(Telefone tel) {
		this.tel = tel;
	}

	public void CriaNumero() {
		ArrayList<String> lista_expressao = this.tel.getExpressao();
		StringBuilder numero = new StringBuilder();
		char aux;

		for (String express : lista_expressao) {
			for (int i = 0; i < express.length(); i++) {
				aux = express.charAt(i);
				numero.append(TransformaExpressao(aux));
			}
			this.tel.AppendNumero(numero.toString());
			numero.delete(0, numero.length());
		}

	}

	private char TransformaExpressao(char charAt) {
		char num = ' ';
		if (Character.toString(charAt).matches("[A-C?]")) {

			num = '2';
		}
		if (Character.toString(charAt).matches("[D-F?]")) {

			num = '3';
		}
		if (Character.toString(charAt).matches("[G-I?]")) {

			num = '4';
		}
		if (Character.toString(charAt).matches("[J-L?]")) {

			num = '5';
		}
		if (Character.toString(charAt).matches("[M-O?]")) {

			num = '6';
		}
		if (Character.toString(charAt).matches("[P-S?]")) {

			num = '7';
		}
		if (Character.toString(charAt).matches("[T-V?]")) {

			num = '8';
		}
		if (Character.toString(charAt).matches("[W-Z?]")) {

			num = '9';

		} else if (charAt == '1' || charAt == '0' || charAt == '-') {

			num = charAt;
		}
		return num;

	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

}
