package br.ufc.arida.ecg.test;

import java.io.File;

import d2rq.dump_rdf;

public class Teste {

	public static void main(String[] args) {
		
		try {
			
			String url = new File("src/main/resources/").getAbsolutePath(); //precisamos desse caminho para funcionar em diversos S.O.
	        String arquivo_mapeamento = url +"/mapping/mapping-iswc.ttl";
			String arquivo_saida = url + "/triples/output.nt";
			String uri = "http://arida.ufc.br/ecg/";
	                
			String argumentos [] = {"-b", uri, "-o", arquivo_saida, arquivo_mapeamento };

			dump_rdf dump = new  dump_rdf();
			dump.process(argumentos);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
