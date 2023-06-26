package exerciciogarrafa;

import java.util.Scanner;

public class Garrafa {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\nOlha, você tem uma garrafa!");
    System.out.println("Qual bebida tem dentro dela?");
    String bebida = input.next();
    System.out.println("\nQuantos litros ela suporta?");
    double litrosTotais = input.nextDouble();
    System.out.println("\nQuantos litros de " + bebida + " ainda tem?");
    double litrosAtuais = input.nextDouble();
    
    UsarGarrafa garrafa = new UsarGarrafa(bebida, litrosTotais, litrosAtuais);
    garrafa.iniciar();
    input.close();
  }
}