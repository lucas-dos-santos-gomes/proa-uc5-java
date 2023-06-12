package classecaneta;

public class Caneta { // Classe
  String modelo;
  String marca;
  String cor;
  float ponta;
  int carga;
  boolean tampada;


  // Métodos
  void riscar() {
    if(this.tampada && this.carga <= 0) {
      System.out.println("ERRO! A caneta está tampada e sem carga, portanto, não dá para riscar!\n");
    } else if(this.tampada) {
      System.out.println("ERRO! A caneta está tampada e não dá para riscar!\n");
    } else if(this.carga <= 0) {
      System.out.println("ERRO! A caneta está sem carga e não dá para riscar!\n");
    } else {
      System.out.println("Bora riscar tudo!\n");
    }
  }

  void tampar() {
    this.tampada = true;
  }

  void destampar() {
    this.tampada = false;
  }

  void estado() {
    System.out.println("Essa caneta é do modelo: " + this.modelo); // This é uma autoreferência do elemento que está instanciando
    System.out.println("Essa caneta é da marca: " + this.marca);
    System.out.println("Essa caneta é da cor: " + this.cor);
    System.out.println("Essa caneta tem a ponta: " + this.ponta);
    System.out.println("Essa caneta está com a carga em: " + this.carga + "%");
    System.out.println("Essa caneta está tampada? " + ((this.tampada)? "Sim" : "Não"));
  }
}