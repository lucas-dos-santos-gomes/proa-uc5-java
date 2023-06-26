package comandosdelacos;
import java.util.Scanner;

public class TestandoFor {
  public static void contagemProgressiva() {
    System.out.print("\n");
    for(int i = 1; i <= 10; i++) {
      System.out.println(i + " é um número " + (i % 2 == 0 ? "par" : "ímpar"));
    }
    System.out.print("\n");
  }
  public static void contarNumeros(int contagem, Scanner input) {
    int par = 0;
    int impar = 0;
    for(int i = 0; i < contagem; i++) {
      System.out.println("\nDigite um número: ");
      int numero = input.nextInt();
      if(numero % 2 == 0) {
        System.out.println("\nO número " + numero + " é par!");
        par++;
      } else {
        System.out.println("\nO número " + numero + " é ímpar!");
        impar++;
      }
    }
    System.out.println("\nNúmeros pares: " + par);
    System.out.println("Números ímpares: " + impar);
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int escolherFuncao;
    do {
      System.out.println("\nQual função você quer fazer?");
      System.out.println("1 - Contagem progressiva");
      System.out.println("2 - Contagem de números pares e ímpares");
      escolherFuncao = input.nextInt();
      if(escolherFuncao != 1 && escolherFuncao != 2) {
        System.out.println("\nVocê digitou uma opção inválida!");
      }
    } while(escolherFuncao != 1 && escolherFuncao != 2);

    if (escolherFuncao == 1) {
      contagemProgressiva();
    } else {
      System.out.println("\nQuantos números você pretende inserir?");
      contarNumeros(input.nextInt(), input);
    }
    input.close();
  }
}