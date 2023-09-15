public class CarroEsportivo extends Carro{
    private int velocidadeMaxima;

    public CarroEsportivo(String marca, String modelo, int ano, Motor motor, int velocidadeMaxima) {
        super(marca, modelo, ano, motor);
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }



    public void acelerar(){
        System.out.println("Acelerando o carro esportivo");
    }

    @Override
    public String toString() {
        String carroEsportivoInfo = super.getMarca() + " " + super.getModelo() + " " + super.getAno();
        return carroEsportivoInfo + "\nVelocidade Máxima: " + velocidadeMaxima + " km/h";    }
}