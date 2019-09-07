package br.edu.unifcv;

public class Pessoa {

	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public String nome;
	
	public int diaAtual;
	public int mesAtual;
	public int anoAtual;
	
	
	
	public void calculo() {
		
	idade = anoAtual - ano;
	
	
	 if (mes >= mesAtual) 
		{
			if( dia > diaAtual) 
			{
				idade = idade - 1;
			}			
		}	
	}
	
	
	public void informar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
	
	public void Ajuste (int diaNovo, int mesNovo, int anoNovo) {
		dia = diaNovo;
		ano = anoNovo;
		mes = mesNovo; 
				
	}
	
	
		
}
	

