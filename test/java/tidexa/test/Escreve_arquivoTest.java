package tidexa.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import tidexa.io.Escreve_arquivo;

public class Escreve_arquivoTest {

	@Test(expected= FileNotFoundException.class)
	public void testEscreve_arquivoEmDiretorioSemPermissao() throws FileNotFoundException {
		String path= "C:/saida.txt";
		Escreve_arquivo arquivo=new Escreve_arquivo(path);
	}

	@Test
	public void testEscreveNaSaida() throws IOException {
		Escreve_arquivo saida= new Escreve_arquivo("C:/Users/Thiago/Documents/Java/testa_saida.txt");
		ArrayList<String> numero=new ArrayList<String>();
		numero.add("teste");
		numero.add("teste2");
		saida.escreveNaSaida(numero);
		File arquivo= new File("C:/Users/Thiago/Documents/Java/testa_saida.txt");
		assertNotNull(arquivo);
	}

}
