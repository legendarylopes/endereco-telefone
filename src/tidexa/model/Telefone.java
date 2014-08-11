package tidexa.model;

import java.util.ArrayList;

public class Telefone {
	private ArrayList<String> expressao;
	private ArrayList<String> numero;
	public Telefone(ArrayList<String> expression ) {
		this.expressao=expression;
		this.numero=new ArrayList<String>();
	}
	public Telefone(){
		this.expressao= new ArrayList<String>();
		this.numero= new ArrayList<String>();
	}
	
	public ArrayList<String> getExpressao() {
		return expressao;
	}
	public void setExpressao(ArrayList<String> expressao) {
		this.expressao = expressao;
	}
	public ArrayList<String> getNumero() {
		return numero;
	}
	public void setNumero(ArrayList<String> numero) {
		this.numero = numero;
	}
	public void AppendNumero(String num){
		this.numero.add(num);
		
	}
	
	
	

}
