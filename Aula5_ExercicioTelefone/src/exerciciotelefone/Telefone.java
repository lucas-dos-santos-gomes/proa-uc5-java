package exerciciotelefone;

import java.util.Scanner;

public class Telefone {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nParabéns pela compra do novo telefone!");
    System.out.println("Qual a marca dele?");
    String marca = input.next();
    System.out.println("\nQuanto de armazenamento ele possui?");
    int armazenamento = input.nextInt();
    System.out.println("\nQuanto de memória RAM ele possui?");
    int memoria = input.nextInt();
    System.out.println("\nPor fim, qual é a operadora do chip?");
    String operadora = input.next();

    ConfigFabrica celular = new ConfigFabrica(marca, armazenamento, memoria, operadora);
    celular.iniciar();
  }
}
