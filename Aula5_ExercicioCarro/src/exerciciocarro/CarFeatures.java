package exerciciocarro;

import java.util.Scanner;

public class CarFeatures {
  Scanner entrada = new Scanner(System.in);

  String marca;
  int qtdMarcha;
  int marchaAtual;
  int velocidadeMaxima;
  int velocidadeAtual;
  double gasolina;
  boolean ligado;

  public CarFeatures(String marca, int qtdMarcha, int velocidadeMaxima, double gasolina) {
    this.marca = marca;
    this.qtdMarcha = qtdMarcha;
    this.velocidadeMaxima = velocidadeMaxima;
    this.gasolina = gasolina;
    this.ligado = false;
  }

  public void LigarCarro() {
    this.ligado = true;
    System.out.println("\nCarro ligado");
  }

  public void DesligarCarro() {
    this.ligado = false;
    System.out.println("\nCarro desligado");
  }

  public void ColocarGasolina(double litros) {
    this.gasolina += litros;
  }

  public void AumentarVelocidade() {
    if(this.ligado) {
      if(this.marchaAtual < this.qtdMarcha && this.gasolina > 5) {
        this.marchaAtual++;
        this.velocidadeAtual = (this.velocidadeMaxima / this.qtdMarcha) * this.marchaAtual;
        this.gasolina -= 5;
      } else {
        if(this.gasolina <= 5) {
          System.out.println("\nVocê está sem gasolina");
        } else {
          System.out.println("\nVocê está na última marcha");
        }
      }
      System.out.println("\nMarcha: " + this.marchaAtual);
      System.out.println("Velocidade: " + this.velocidadeAtual);
    } else {
      System.out.println("\nVocê precisa ligar o carro antes");
    }
  }
  
  public void DiminuirVelocidade() {
    if(this.ligado) {
      if(this.marchaAtual > 0) {
        this.marchaAtual--;
        this.velocidadeAtual = (this.velocidadeMaxima / this.qtdMarcha) * this.marchaAtual;
      } else {
        System.out.println("\nVocê está na marcha neutra");
      }
      System.out.println("\nMarcha: " + this.marchaAtual);
      System.out.println("Velocidade: " + this.velocidadeAtual);
    } else {
      System.out.println("\nVocê precisa estar em movimento");
    }
  }

  public void Estacionar() {
    if(this.ligado) {
      while(this.marchaAtual > 1) {
        this.marchaAtual--;
        this.velocidadeAtual = (this.velocidadeMaxima / this.qtdMarcha) * this.marchaAtual;
        System.out.println("\nMarcha: " + this.marchaAtual);
        System.out.println("Velocidade: " + this.velocidadeAtual);
      }
      System.out.println("\nEstacionando...");
      DesligarCarro();
    } else {
      System.out.println("\nNão tem como estacionar um carro parado...");
    }
  }

  public void Iniciar() {
    int opcao;
    do {
      ExibirMenu();
      opcao = entrada.nextInt();
      EscolherFuncao(opcao);
    } while(opcao != 7);
  }

  public void ExibirMenu() {
    System.out.println("\nVocê está no seu carro " + this.marca);
    System.out.println("Escolha sua opção:");
    System.out.println("\n1 - Ligar o carro");
    System.out.println("2 - Colocar gasolina");
    System.out.println("3 - Aumentar a velocidade");
    System.out.println("4 - Diminuir a velocidade");
    System.out.println("5 - Estacionar o carro");
    System.out.println("6 - Desligar o carro");
    System.out.println("7 - Sair do carro");
  }

  public void EscolherFuncao(int opcao) {
    double litros;
    switch(opcao) {
      case 1:
        LigarCarro();
        break;
      case 2:
        System.out.println("\nDigite quantos litros você irá colocar no carro:");
        litros = entrada.nextDouble();
        ColocarGasolina(litros);
        break;
      case 3:
        AumentarVelocidade();
        break;
      case 4:
        DiminuirVelocidade();
        break;
      case 5:
        Estacionar();
        break;
      case 6:
        DesligarCarro();
        break;
      case 7:
        System.out.println("\nVocê saiu do carro...");
        break;
      default:
        System.out.println("\nOpção inválida!");
        break;
    }
  }
}