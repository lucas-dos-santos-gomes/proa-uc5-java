package caixaeletronico;

public class CaixaEletronico {
  public static void main(String[] args) {
    System.out.println("Exemplo de Caixa Eletrônico - Método Construtor");
    Conta contaLucas = new Conta("Lucas Gomes", 492631);
    contaLucas.VerSaldo();
    contaLucas.Saque(10250);

    System.out.println();
    Conta contaAndreia = new Conta("Andreia Silva", 12543.57);
    contaAndreia.VerSaldo();
    contaAndreia.Deposito(62000);

    System.out.println();
    Conta contaElder = new Conta("Elder Barbosa", 4713.24);
    contaElder.VerSaldo();
    contaElder.Saque(8940.97);
  }
}