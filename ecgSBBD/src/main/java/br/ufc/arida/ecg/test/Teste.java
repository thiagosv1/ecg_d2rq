package br.ufc.arida.ecg.test;

import d2rq.dump_rdf;

public class Teste {
	//-o /home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/saidalll.nt 
	//"/home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/mapping-iswc.ttl"
	public static void main(String[] args) {
       
		String arguments [] = {"-b", "http://arida.ufc.br/ecg/", "-o", "/home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/output.nt", "/home/salomao/git/ecg_d2rq/ecgSBBD/src/main/resources/mapping-iswc.ttl"};
		
		try {
			dump_rdf dump = new  dump_rdf();
			
			dump.process(arguments);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


}
