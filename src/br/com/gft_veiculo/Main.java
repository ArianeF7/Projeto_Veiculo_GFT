package br.com.gft_veiculo;

public class Main {

	public static void main(String[] args) {
		
		carro c = new carro();
		
		c.ligar();
		c.abastecer(25);
		c.abastecer(200);
		c.acelerar();
		c.frear();
		//c.pintar();
		c.frear();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.abastecer(2);
		c.desligar();
						
	}
}
