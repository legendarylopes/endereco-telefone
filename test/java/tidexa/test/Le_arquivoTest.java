package tidexa.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import tidexa.io.Le_arquivo;
import tidexa.model.Telefone;

public class Le_arquivoTest {

	@Test(expected=FileNotFoundException.class)
	public void testLe_arquivo_nao_existe() throws FileNotFoundException {
		String path="C:/falha.txt";
		Le_arquivo novo= new Le_arquivo(path);
	}

	@Test
	public void testLeArquivoParaTelefone() throws FileNotFoundException {
		Le_arquivo data = new Le_arquivo("C:/teste_scanner.txt");
		Telefone tel=data.LeArquivoParaTelefone();
		assertNotNull(tel);
	}

}
