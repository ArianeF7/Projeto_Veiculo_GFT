package br.com.gft_veiculo;

public class carro {

	// ATRIBUTOS
	private String marca, modelo, placa, cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel, Velocidade;
	private Double preco;

	// METODOS
	// METODO CONSTRUTOR

	public carro() {
		this.marca = "";
		this.modelo = "";
		this.placa = "";
		this.cor = "Amarelo";
		this.km = 0;
		this.isLigado = false;
		this.litrosCombustivel = 50;
		this.Velocidade = 0;
		this.preco = 25000.00;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado == true) {
			this.Velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("o carro foi acelerado, a velocidade agora é: " + this.Velocidade + " km por hora");
			System.out.println("O combustivel diminuiu e agora tem: " + this.litrosCombustivel + " litros");
		} else {
			System.out.println("Não é possivel acelerar, Ligue o carro");
		}

	}

	public void abastecer(int qtdLitros) {
		if (this.litrosCombustivel >= 100) {
			this.litrosCombustivel = 100;
			System.out.println("O carro foi abastecido e tem " + this.litrosCombustivel + " litros de combustivel");
		} else {
			this.litrosCombustivel += qtdLitros;
			if (this.litrosCombustivel >= 100) {
				this.litrosCombustivel = 100;
				System.out.println("O carro foi abastecido e tem " + this.litrosCombustivel + " litros de combustivel");
			} else {
				System.out.println("O carro foi abastecido e tem " + this.litrosCombustivel + " litros de combustivel");
			}
		}
	}

	public void frear() {
		if (this.isLigado == true) {
			if (this.Velocidade <= 10) {
				this.Velocidade = 0;
				System.out.println("O carro parou");
			} else if (this.Velocidade >= 10) {
				this.Velocidade -= 10;
				System.out.println("O  carro foi freado a velocidade agora é: " + this.Velocidade + " km por hora");
			} else {
				System.out.println("O carro está parado!");
			}
		}
	}

	public void pintar() {

	}

	public void ligar() {
		if (this.isLigado == false) {
			this.isLigado = true;
			System.out.println("Carro ligou");
		} else {
			System.out.println("O carro ja está ligado!");
		}
	}

	public void desligar() {
		if (this.isLigado == true) {
			this.isLigado = false;
			System.out.println("Carro desligou");
		} else {
			System.out.println("O carro ja está desligado!");
		}
	}

}
