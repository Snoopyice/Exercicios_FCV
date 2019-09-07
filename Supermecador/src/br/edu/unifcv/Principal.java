package br.edu.unifcv;

public class Principal {
	
	public static void main(String[] args) {
			
		Pedido pedido1 = new Pedido ();
		
		pedido1.codigoPedido = 1;
		pedido1.formaPagamento = "Dinheiro";
		pedido1.quantItensPedida = 2;
		
		
		pedido1.nome = "Rafael";
		pedido1.cpf = "234.476.123-19";
		
		pedido1.codigoProduto = 1;
		pedido1.precoProduto = 10;
		pedido1.quantidadeEstoqueProduto = 20;
		pedido1.tipoProduto = "Arroz";
		pedido1.quantidadePedida = 2;
		
		pedido1.codigoProduto2 = 2;
		pedido1.precoProduto2 = 15;
		pedido1.quantidadeEstoqueProduto2 = 24;
		pedido1.tipoProduto2 = "Feijão";
		pedido1.quantidadePedida2 = 1;
		
	
		
		pedido1.pedido();
		
	


	Pedido pedido2 = new Pedido ();
	
	pedido2.codigoPedido = 2;
	pedido2.formaPagamento = "Cartao Debito";
	pedido2.quantItensPedida = 1;
	
	pedido2.nome = "Gabriel";
	pedido2.cpf = "432.674.321-19";
	
	pedido2.codigoProduto = 2;
	pedido2.precoProduto = 15;
	pedido2.quantidadeEstoqueProduto = 24;
	pedido2.tipoProduto = "Feijão";
	pedido2.quantidadePedida = 3;
	
	
	
			
	pedido2.pedido();
	

}

}