package Carro;

/**
 * A classe Carro representa um veículo com propriedades básicas
 * como modelo, marca, ano de fabricação e velocidade atual.
 */
public class Carro {

    // Propriedades do carro
    private String modelo;
    private String marca;
    private int anoFabricacao;
    private double velocidadeAtual;

    /**
     * Construtor da classe Carro.
     *
     * @param modelo O modelo do carro.
     * @param marca A marca do carro.
     * @param anoFabricacao O ano de fabricação do carro.
     */
    public Carro(String modelo, String marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = 0; // A velocidade inicial é 0
    }

    /**
     * Método para acelerar o carro.
     *
     * @param incremento A quantidade a ser incrementada na velocidade atual.
     */
    public void acelerar(double incremento) {
        if (incremento > 0) {
            this.velocidadeAtual += incremento;
        }
    }

    /**
     * Método para frear o carro.
     *
     * @param decremento A quantidade a ser decrementada na velocidade atual.
     */
    public void frear(double decremento) {
        if (decremento > 0 && this.velocidadeAtual >= decremento) {
            this.velocidadeAtual -= decremento;
        } else if (this.velocidadeAtual < decremento) {
            this.velocidadeAtual = 0;
        }
    }

    /**
     * Método para obter as informações do carro.
     *
     * @return Uma string contendo as informações do carro.
     */
    public String getInformacoes() {
        return "Modelo: " + this.modelo + ", Marca: " + this.marca +
                ", Ano: " + this.anoFabricacao + ", Velocidade Atual: " + this.velocidadeAtual + " km/h";
    }

    // Métodos getters e setters para as propriedades

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
