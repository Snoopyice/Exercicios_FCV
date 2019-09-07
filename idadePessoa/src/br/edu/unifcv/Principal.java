package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.nome="Rafael";
		p.ano=1998;
		p.mes=7;
		p.dia=7;
	
		
		p.anoAtual=2019;
		p.mesAtual=9;
		p.diaAtual=6;
		
		p.calculo();
		
		p.informar();
		
		p.Ajuste(4, 1, 2000);
		
		p.calculo();
		
		p.informar();
				
		
		
		
	}
}
