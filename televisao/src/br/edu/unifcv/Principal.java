package br.edu.unifcv;

public class Principal {
	
	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.aumentarCanal();
		c.consultaCanal();
		c.diminuirCanal();
		c.consultaCanal();
		c.canalIndicado(4);
		c.consultaCanal();
		c.aumentarVolume();
		c.consultaVolume();
		c.diminuirVolume();
		c.consultaVolume();
	}

}
