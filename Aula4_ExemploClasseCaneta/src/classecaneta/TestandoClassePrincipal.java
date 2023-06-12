package classecaneta;

public class TestandoClassePrincipal {
  public static void main(String[] args) {
    System.out.println("Testando classes dentro do Java");
    Caneta canetaBic = new Caneta();

    canetaBic.modelo = "Transparente";
    canetaBic.marca = "BIC";
    canetaBic.cor = "Preta";
    canetaBic.ponta = 0.5f; // Float precisa de um f no final do número quando for decimal
    canetaBic.carga = 83;
    canetaBic.tampar();
    canetaBic.estado();
  }
}