package tidexa.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import tidexa.model.Telefone;

public class Le_arquivo {
	FileReader file;
	public Le_arquivo(String path) throws FileNotFoundException {
		try {
			this.file=new FileReader(path);
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}
			
	}
	public Telefone LeArquivoParaTelefone(){
		Telefone tel= new Telefone();
		ArrayList<String> lista_expressao=new ArrayList<String>();
		BufferedReader check= new BufferedReader(file);
		Scanner scan=new Scanner(this.file).useDelimiter("\\n");
		String expressao=" ";
		while(scan.hasNext()){
			expressao=scan.next();
			lista_expressao.add(expressao);		
		}
		tel.setExpressao(lista_expressao);
		return tel;
		
		
	}

}
