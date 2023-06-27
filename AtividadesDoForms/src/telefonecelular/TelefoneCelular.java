package telefonecelular;

public class TelefoneCelular {
  private String marca;
  private int armazenamento;
  private int memoria;
  private double porcentagemBateria;
  private boolean ligado;

  public TelefoneCelular(String marca, int armz, int memoria) {
    this.marca = marca;
    this.armazenamento = armz;
    this.memoria = memoria;
    this.ligado = false;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getArmazenamento() {
    return this.armazenamento;
  }

  public void setArmazenamento(int armz) {
    this.armazenamento = armz;
  }

  public int getMemoria() {
    return this.memoria;
  }

  public void setMemoria(int memory) {
    this.memoria = memory;
  }

  public double getPorcentagemBateria() {
    return this.porcentagemBateria;
  }

  public void setPorcentagemBateria(double percent) {
    this.porcentagemBateria = percent;
  }

  public boolean getLigado() {
    return this.ligado;
  }

  public void ligar() {
    this.ligado = true;
  }

  public void desligar() {
    this.ligado = false;
  }

  public void status() {
    System.out.println("\nConfigurações desse telefone celular");
    System.out.println(" = Marca: " + this.getMarca());
    System.out.println(" = Armazenamento: " + this.getArmazenamento() + "gb");
    System.out.println(" = Memoria: " + this.getMemoria() + "gb RAM");
    System.out.println(" = Porcentagem da bateria: " + this.getPorcentagemBateria() + "%");
    System.out.println(" = Esse telefone celular está " + (this.getLigado() ? "ligado" : "desligado"));
  }
}