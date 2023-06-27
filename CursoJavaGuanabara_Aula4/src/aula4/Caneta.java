package aula4;

public class Caneta {
  public String modelo;
  private String cor;
  private double ponta;
  private boolean tampada;

  public Caneta(String cor) {
    this.tampar();
    this.cor = cor;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getPonta() {
    return this.ponta;
  }

  public void setPonta(double ponta) {
    this.ponta = ponta;
  }

  public void tampar() {
    this.tampada = true;
  }

  public void destampar() {
    this.tampada = false;
  }

  public void status() {
    System.out.println("\nSobre a caneta");
    System.out.println("Cor: " + this.cor);
    System.out.println("Modelo: " + this.modelo);
    System.out.println("Ponta: " + this.getPonta());
    System.out.println("Essa caneta está " + (tampada ? "tampada" : "destampada"));
  }
}