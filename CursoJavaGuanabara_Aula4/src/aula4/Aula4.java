package aula4;

public class Aula4 {
  public static void main(String[] args) {
    Caneta caneta1 = new Caneta("Azul");
    caneta1.setModelo("Bic");
    caneta1.modelo = "BIC";

    caneta1.setPonta(0.5);
    // caneta1.ponta = 10; não pode pois ponta é privado

    caneta1.tampar();
    caneta1.status();
  }
}