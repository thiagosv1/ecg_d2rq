package br.ufc.arida.ecg.test;

import java.io.File;

import d2rq.dump_rdf;
import d2rq.generate_mapping;

public class Teste {

	public static void main(String[] args) {
		
		try {
			
			String url = new File("src/main/resources/").getAbsolutePath(); //precisamos desse caminho para funcionar em diversos S.O.
	        String arquivo_mapeamento = url +"/mapping/iswc.ttl";
			String arquivo_saida = url + "/triples/direct_ontology_iswc.owl";
			String uri = "http://arida.ufc.br/iswc/";
	                
            String argumentos2 [] = {"-d","org.postgresql.Driver", "-u","postgres", "-p","postgres", "-o", arquivo_mapeamento, "jdbc:postgresql://localhost:5432/iswc?autoReconnect=true" };
			
			generate_mapping generate_mapping = new generate_mapping();
			
			generate_mapping.process(argumentos2);
			

			String argumentos [] = {"-b", uri, "-f", "RDF/XML-ABBREV", "-o", arquivo_saida, arquivo_mapeamento };
			  
			 dump_rdf dump = new dump_rdf(); 
			 
			 dump.process(argumentos);
			 
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
