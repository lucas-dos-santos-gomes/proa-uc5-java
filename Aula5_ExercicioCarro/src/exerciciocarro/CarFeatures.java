package exerciciocarro;

public class CarFeatures {
  String marca;
  int qtdPortas;
  int qtdMarcha;
  int velocidadeMaxima;
  float gasolina;
  boolean automatico;
  boolean ligado;

  public void LigarCarro() {
    this.ligado = true;
  }
}