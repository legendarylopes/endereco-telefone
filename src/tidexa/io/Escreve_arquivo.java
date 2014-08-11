package tidexa.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import tidexa.model.Telefone;

public class Escreve_arquivo {
	File out;
public Escreve_arquivo(String path)throws FileNotFoundException{
	this.out=new File(path);
}
public void escreveNaSaida(ArrayList<String> numero) throws IOException{
	FileWriter writer=new FileWriter(this.out);
	for(int i=0;i<numero.size();i++){
		writer.write(numero.get(i)+ System.getProperty("line.separator"));		
	}
	writer.close();
	
	
}

}
