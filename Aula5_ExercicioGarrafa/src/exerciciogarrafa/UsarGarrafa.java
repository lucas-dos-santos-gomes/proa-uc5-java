package exerciciogarrafa;

import java.util.Scanner;

public class UsarGarrafa {
  Scanner input = new Scanner(System.in);
  
  String bebida;
  double litrosTotais;
  double litrosAtuais;
  double percentual;
  boolean aberta;

  public UsarGarrafa(String bebida, double litrosTotais, double litrosAtuais) {
    this.bebida = bebida;
    this.litrosTotais = litrosTotais;
    this.litrosAtuais = litrosAtuais;
    this.percentual = (litrosAtuais * 100) / litrosTotais;
    
    status();
  }

  public void abrirGarrafa() {
    if(this.aberta) {
      System.out.println("\nA garrafa já está aberta!");
    } else {
      this.aberta = true;
      System.out.println("\nVocê abriu a garrafa.");
    }
  }

  public void fecharGarrafa() {
    if(this.aberta) {
      this.aberta = false;
      System.out.println("\nVocê fechou a garrafa.");
    } else {
      System.out.println("\nA garrafa já está fechada!");
    }
  }

  public void beberGarrafa(double bebido) {
    if (this.aberta) {
      this.litrosAtuais -= bebido;
      this.percentual = (this.litrosAtuais * 100) / this.litrosTotais;
    } else {
      System.out.println("\nVocê precisa abrir a garrafa primeiro.");
    }
  }

  public void encherGarrafa(double colocado) {
    if (this.aberta) {
      this.litrosAtuais += colocado;
      this.percentual = (this.litrosAtuais * 100) / this.litrosTotais;
    } else {
      System.out.println("\nVocê precisa abrir a garrafa primeiro.");
    }
  }

  public void jogarGarrafa() {
    if(this.litrosAtuais <= 0 && !this.aberta) {
      System.out.println("\nVocê jogou a garrafa no lixo.");
    } else if(this.aberta) {
      System.out.println("\nVocê precisa fechar a garrafa primeiro.");
    } else {
      System.out.println("\nAinda tem " + this.bebida + " na garrafa.");

    }
  }

  public void status() {
    System.out.println("\nBebida: " + bebida);
    System.out.println("Litros suportados: " + this.litrosTotais + "L");
    System.out.println("Litros armazenados: " + this.litrosAtuais + "L");
    System.out.println("Percentual preenchido: " + this.percentual);
  }

  public void iniciar() {
    int opcao;
    do {
      exibirMenu();
      opcao = input.nextInt();
      escolherFuncao(opcao);
    } while(opcao != 7);
  }

  public void exibirMenu() {
    System.out.println("\nVocê está com sua garrafa");
    System.out.println("Escolha sua opção:");
    System.out.println("\n1 - Abrir a garrafa");
    System.out.println("2 - Beber na garrafa");
    System.out.println("3 - Encher a garrafa");
    System.out.println("4 - Jogar fora");
    System.out.println("5 - Fechar a garrafa");
    System.out.println("6 - Ver status");
    System.out.println("7 - Ir embora");
  }

  public void escolherFuncao(int opcao) {
    double litros;
    switch(opcao) {
      case 1:
        abrirGarrafa();
        break;
      case 2:
        System.out.println("\nDigite quantos litros você irá beber:");
        litros = input.nextDouble();
        beberGarrafa(litros);
        break;
      case 3:
        System.out.println("\nDigite quantos litros você irá colocar na garrafa:");
        litros = input.nextDouble();
        encherGarrafa(litros);
        break;
      case 4:
        jogarGarrafa();
        break;
      case 5:
        fecharGarrafa();
        break;
      case 6:
        status();
        break;
      case 7:
        System.out.println("\nVocê deixou a garrafa.");
        break;
      default:
        System.out.println("\nOpção inválida!");
        break;
    }
  }
}