package tidexa.principal;

import java.io.IOException;
import java.util.Scanner;

import tidexa.io.Le_arquivo;
import tidexa.io.Escreve_arquivo;
import tidexa.logica.Tool_Tel;
import tidexa.model.Telefone;

public class executa {

	public static void main(String[] args) throws IOException {
		String entrada=" ";
		String exit= " ";
		Scanner in= new Scanner(System.in);
		System.out.println("Entre com o path do arquivo de entrada:");
		entrada= in.nextLine();
		System.out.println("Entre com o path do arquivo de saida:");
		exit= in.nextLine();
		Le_arquivo data = new Le_arquivo(entrada);
		Telefone tel=data.LeArquivoParaTelefone();
		Tool_Tel tool=new Tool_Tel(tel);
		tool.CriaNumero();
		tel=tool.getTel();
		Escreve_arquivo saida= new Escreve_arquivo(exit);
		try {
			saida.escreveNaSaida(tel.getNumero());
			
		} catch (IOException e) {

			e.printStackTrace();
		}
        
	}
}
