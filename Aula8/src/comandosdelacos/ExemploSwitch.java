package comandosdelacos;

import java.util.Scanner;

public class ExemploSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Informe o dia da semana (1 - 7):");
    int numeroDia = input.nextInt();
    String nomeDia;
    boolean diaInvalido = false;

    switch (numeroDia) {
      case 1:
        nomeDia = "Domingo";
        break;
      case 2:
        nomeDia = "Segunda-feira";
        break;
      case 3:
        nomeDia = "Terça-feira";
        break;
      case 4:
        nomeDia = "Quarta-feira";
        break;
      case 5:
        nomeDia = "Quinta-feira";
        break;
      case 6:
        nomeDia = "Sexta-feira";
        break;
      case 7:
        nomeDia = "Sábado";
        break;
      default:
      nomeDia = "";
        diaInvalido = true;
        break;
    }

    String printar = (diaInvalido) ? "Você digitou um dia inválido" : ("Hoje é " + nomeDia);
    System.out.println("\n" + printar);
    input.close();
  }
}