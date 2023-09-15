public class Main {
    public static void main(String[] args) {
//        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
//        meuCarro.exibirInformacoes();
//        meuCarro.rodar(100);
//        meuCarro.rodar(-100);
//        System.out.println("Quilometragem: " + meuCarro.getQuilometragem());

        Motor motorCarroEsportivo = new Motor("v12", 700);
        CarroEsportivo meuCarroEsportivo = new CarroEsportivo("Ferrari", "488 GTB", 2023, motorCarroEsportivo, 320);
        meuCarroEsportivo.setVelocidadeMaxima(300);
        meuCarroEsportivo.acelerar();
        System.out.println(meuCarroEsportivo);
        meuCarroEsportivo.setVelocidadeMaxima(80);
        System.out.println(meuCarroEsportivo);

        Motor motorCarro = new Motor("v8", 500);
        Carro meuCarroComMotor = new Carro("Chevrolet", "Camaro", 2023, motorCarro);
        meuCarroComMotor.rodar(100);
        meuCarroComMotor.rodar(-100);
        System.out.println(meuCarroComMotor);
        meuCarroComMotor.ligarCarro();
    }
}
