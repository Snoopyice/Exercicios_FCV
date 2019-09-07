package br.edu.unifcv;

public class Pedido extends Cliente {
	
		
		
	public String formaPagamento;
	public int quantidadePedida;
	public int codigoPedido;
	public int quantItensPedida;
	public int quantidadePedida2;
	
	public void pedido () {
		

	if (quantItensPedida > 1) {	
		System.out.println("--------------------------------");
		System.out.println("codigo do pedido: "+codigoPedido);
		System.out.println("Cliente: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Forma de pagamento: "+formaPagamento);
		System.out.println("---                             ---");
	
		System.out.println("Item:  "+ codigoProduto);
		System.out.println("Tipo: "+tipoProduto);
		System.out.println("quantidade: "+quantidadePedida);
		System.out.println("Preço: "+precoProduto);
		System.out.println("---                             ---");
		
		System.out.println("Item:  "+ codigoProduto2);
		System.out.println("Tipo: "+tipoProduto2);
		System.out.println("Quantidade: "+quantidadePedida2);
		System.out.println("Preço: "+precoProduto2);
		
		
		
	}else {
		System.out.println("--------------------------------");
		System.out.println("codigo do pedido: "+codigoPedido);
		System.out.println("Cliente: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Forma de pagamento: "+formaPagamento);
		System.out.println("---                             ---");
		
		System.out.println("Item:  "+ codigoProduto);
		System.out.println("Tipo: "+tipoProduto);
		System.out.println("quantidade: "+quantidadePedida);
		System.out.println("Preço: "+precoProduto);
		System.out.println("---                             ---");
		
		
	}
		
	

	
}	
}