package caixaeletronico;

public class CaixaEletronico {
  public static void main(String[] args) {
    System.out.println("Exemplo de Caixa Eletrônico - Método Construtor");
    Conta contaAndreia = new Conta("Andreia Silva", 12543.57);
    contaAndreia.VerSaldo();
    contaAndreia.Deposito(62000);

    System.out.println();
    Conta contaElder = new Conta("Elder Barbosa", 4713.24);
    contaElder.VerSaldo();
    contaElder.Saque(8940.97);

    System.out.println();
    Conta contaLucas = new Conta("Lucas Gomes", 492631);
    contaLucas.Iniciar();
  }
}