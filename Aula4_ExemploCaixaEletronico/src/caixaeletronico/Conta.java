package caixaeletronico;
import java.util.Random;

public class Conta {
  String titular;
  int numeroConta;
  double saldo;

  public Conta(String nomeTitular, double saldoInicial) {
    this.titular = nomeTitular;
    this.saldo = saldoInicial;

    Random geraNumero = new Random();
    this.numeroConta = geraNumero.nextInt(1000000, 9999999);
  }

  public void VerSaldo() {
    System.out.println("O número da conta é: " + this.numeroConta);
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
}