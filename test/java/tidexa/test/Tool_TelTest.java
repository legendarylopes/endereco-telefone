package tidexa.test;

import java.util.ArrayList;

import junit.framework.Assert;

import org.junit.Test;

import tidexa.logica.Tool_Tel;
import tidexa.model.Telefone;

public class Tool_TelTest {

	@Test
	public void testaLogica(){
		ArrayList<String> expressao=new ArrayList<String>();
		expressao.add("AA-AAA");
		expressao.add("DD-DDD");
		expressao.add("GG-GGG");
		Telefone tel=new Telefone(expressao);
		Tool_Tel tool=new Tool_Tel(tel);
		tool.CriaNumero();
		ArrayList<String>numero=tool.getTel().getNumero();
		
		Assert.assertEquals("22-222", numero.get(0));
		Assert.assertEquals("33-333", numero.get(1));
		Assert.assertEquals("44-444", numero.get(2));
		}
	@Test
	public void testaExpressaoBizzarra(){
		ArrayList<String> expressao=new ArrayList<String>();
		expressao.add("~~-~~~");
		expressao.add("11-111");
		expressao.add("~*-!@#");
		Telefone tel=new Telefone(expressao);
		Tool_Tel tool=new Tool_Tel(tel);
		tool.CriaNumero();
		ArrayList<String> numero= tool.getTel().getNumero();
		Assert.assertEquals("  -   ", numero.get(0));
		Assert.assertEquals("11-111", numero.get(1));
		Assert.assertEquals("  -   ", numero.get(2));
		
	}
	
	
	
	}
