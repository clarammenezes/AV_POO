public class Carro {
   private String marca;
   private String modelo;
   private int ano;
   private int quilometragem;
   
   private Motor motor;


    public Carro() {
    }

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void rodar(int quilometros) {
        if (quilometros >= 0) {
            this.quilometragem += quilometros;
        } else {
            System.out.println("Não é possível rodar uma distância negativa.");
        }
    }

    public void ligarCarro(){
        motor.ligar();
        System.out.println("Carro ligado!");
    }

    @Override
    public String toString(){
        String carroInfo = getMarca() + " " + getModelo() + " " + getAno();
        return carroInfo;
    }

}
