package br.edu.unifcv;

public class ControleRemoto extends Televisao{
	
	public void aumentarCanal () {
		canal = canal + 1;
	}
	public void diminuirCanal () {
		canal = canal -1;
	}
	public void canalIndicado (int canalSelecionado) {
		canal = canalSelecionado;
	}
	public void consultaCanal () {
		System.out.println("Canal atual: " + canal);
	}
	
	public void aumentarVolume () {
		volume = volume + 1;
	}
	public void diminuirVolume () {
		volume = volume - 1;
	}
	public void consultaVolume () {
		System.out.println("Volume atual: " + volume);
	}

}
