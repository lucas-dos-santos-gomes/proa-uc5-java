package exerciciocarro;

import java.util.Scanner;

public class Car {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("UAU! Você comprou um carro novo!");
    System.out.println("Qual a marca do carro?");
    String marca = entrada.next();
    System.out.println("\nQuantas marchas esse " + marca + " tem?");
    int marchas = entrada.nextInt();
    System.out.println("\nE a velocidade máxima, qual é?");
    int velocidade = entrada.nextInt();
    System.out.println("\nPor último, diga quantos litros já tem no tanque:");
    double gasolina = entrada.nextDouble();
    CarFeatures carro = new CarFeatures(marca, marchas, velocidade, gasolina);
    carro.Iniciar();
  }
}