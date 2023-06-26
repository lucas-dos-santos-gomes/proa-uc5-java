package exerciciotelefone;

import java.util.Scanner;

public class ConfigFabrica {
  Scanner input = new Scanner(System.in);

  String marca;
  int armazenamento;
  int memoria;
  String operadora;
  boolean ligado;
  boolean carregado;
  double creditos;

  public ConfigFabrica(String marca, int armaz, int ram, String chip) {
    this.marca = marca;
    this.armazenamento = armaz;
    this.memoria = ram;
    this.operadora = chip;
    
    this.ligado = false;
    this.carregado = false;
    this.creditos = 0;

    System.out.println("\nEsse telefone está desligado, sem bateria e não tem créditos.");
  }

  public void configuracoes() {
    System.out.println("\nMarca: " + this.marca);
    System.out.println("Armazenamento: " + this.armazenamento);
    System.out.println("Memória RAM: " + this.memoria);
    System.out.println("Operadora: " + this.operadora);
    System.out.println("Ligado: " + (this.ligado ? "sim" : "não"));
    System.out.println("Carregado: " + (this.carregado ? "sim" : "não"));
    System.out.println("Créditos: " + this.creditos);
  }

  public void ligarTelefone() {
    this.ligado = true;
    System.out.println("\nVocê ligou o telefone.");
  }

  public void desligarTelefone() {
    this.ligado = false;
    System.out.println("\nVocê desligou o telefone.");
  }

  public void carregarTelefone() {
    this.carregado = true;
    System.out.println("\nVocê carregou o telefone.");
  }

  public void colocarCredito() {
    if (this.carregado) {
      if(this.ligado) {
        System.out.println("\nVocê deseja colocar quanto de crédito?");
        this.creditos += input.nextDouble();
        System.out.println("\nAgora, você está com " + this.creditos + " de crédito.");
      } else {
        System.out.println("\nO telefone está desligado. Você precisa ligá-lo primeiro.");
      }
    } else {
      System.out.println("\nO telefone está descarregado. Você precisa carregá-lo primeiro.");
    }
  }

  public void fazerLigação(String nome) {
    if (this.carregado) {
      if(this.ligado) {
        if(this.creditos >= 5) {
          System.out.println("\nLigando para " + nome + "...\n.\n.\n.\n");
          this.creditos -= 5;
          System.out.println("Ligação concluída");
        } else {
          System.out.println("\nVocê precisa colocar crédito no seu telefone.");
        }
      } else {
        System.out.println("\nO telefone está desligado. Você precisa ligá-lo primeiro.");
      }
    } else {
      System.out.println("\nO telefone está descarregado. Você precisa carregá-lo primeiro.");
    }
  }

  public void iniciar() {
    int opcao;
    do {
      exibirMenu();
      opcao = input.nextInt();
      escolherFuncao(opcao);
    } while(opcao != 6);
  }
  
  public void exibirMenu() {
    System.out.println("\nO que deseja fazer a seguir?");
    System.out.println("1 - Ligar o aparelho");
    System.out.println("2 - Carregar o telefone");
    System.out.println("3 - Mostrar configurações");
    System.out.println("4 - Colocar crédito");
    System.out.println("5 - Fazer ligação");
    System.out.println("6 - Desligar telefone");
  }

  public void escolherFuncao(int opcao) {

    switch(opcao) {
      case 1:
        ligarTelefone();
        break;
      case 2:
        carregarTelefone();
        break;
      case 3:
        configuracoes();
        break;
      case 4:
        colocarCredito();
        break;
      case 5:
        System.out.println("\nDigite o nome da pessoa que você quer ligar:");
        String nome = input.next();
        fazerLigação(nome);
        break;
      case 6:
        desligarTelefone();
        break;
      default:
        System.out.println("\nOpção inválida!");
        break;
    }
  }
}
