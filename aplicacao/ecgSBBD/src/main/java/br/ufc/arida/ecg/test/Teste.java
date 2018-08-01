package br.ufc.arida.ecg.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


import d2rq.dump_rdf;

public class Teste {
	//-o /home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/saidalll.nt 
	//"/home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/mapping-iswc.ttl"
	public static void main(String[] args) {
		
		
		String url = new File("src/main/resources/").getAbsolutePath();
    	String arquivo_saida = url + "/triples/output.nt";

        String arquivo_mapeamento = url +"/mapping/mapping-iswc.ttl";
       
		String arguments [] = {"-b", "http://arida.ufc.br/ecg/", "-o", arquivo_saida, arquivo_mapeamento };
		
		try {
			dump_rdf dump = new  dump_rdf();
			
			dump.process(arguments);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
