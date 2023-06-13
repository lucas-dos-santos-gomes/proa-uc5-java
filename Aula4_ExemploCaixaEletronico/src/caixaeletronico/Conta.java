package caixaeletronico;

import java.util.Random;
import java.util.Scanner;

public class Conta {
  String titular;
  int numeroConta;
  double saldo;

  Random geraNumero = new Random();
  Scanner entrada = new Scanner(System.in);

  public Conta(String nomeTitular, double saldoInicial) {
    this.titular = nomeTitular;
    this.saldo = saldoInicial;
    this.numeroConta = geraNumero.nextInt(1000000, 9999999);
  }

  public void VerSaldo() {
    System.out.println("\nO número da conta é: " + this.numeroConta);
    System.out.println("O nome do titular é: " + this.titular);
    System.out.println("O saldo da conta é: " + this.saldo);
  }

  public void Saque(double valorSaque) {
    if(this.saldo >= valorSaque) {
      this.saldo -= valorSaque;
      System.out.println("\nValor sacado: " + valorSaque + "\nSaldo atual: " + this.saldo + " reais");
    } else {
      System.out.println("\nSaldo insuficiente!");
    }
  }

  public void Deposito(double valorDeposito) {
    if(valorDeposito <= 0) {
      System.out.println("\nVocê precisa depositar um valor válido!");
    } else {
      this.saldo += valorDeposito;
      System.out.println("\nValor depositado: " + valorDeposito);
      System.out.println("Saldo atual: " + this.saldo);
    }
  }

  public void Iniciar() {
    int opcao;
    do {
      ExibirMenu();
      opcao = entrada.nextInt();
      EscolherFuncao(opcao);
    } while(opcao != 4);
  }
  
  public void ExibirMenu() {
    System.out.println("\nBem vindo ao banco H-bank");
    System.out.println("Escolha sua opção:");
    System.out.println("1 - Ver saldo");
    System.out.println("2 - Sacar");
    System.out.println("3 - Depositar");
    System.out.println("4 - Finalizar");
  }

  public void EscolherFuncao(int opcao) {
    double saque;
    double deposito;

    switch(opcao) {
      case 1:
        VerSaldo();
        break;
      case 2:
        System.out.println("\nDigite o valor a ser sacado:");
        saque = entrada.nextDouble();
        Saque(saque);
        break;
      case 3:
        System.out.println("\nDigite o valor que será depositado:");
        deposito = entrada.nextDouble();
        Deposito(deposito);
      case 4:
        System.out.println("\nOperação finalizada!");
        break;
      default:
        System.out.println("Opção inválida!");
        break;
    }
  }
}