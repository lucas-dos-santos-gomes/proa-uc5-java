import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double weight, height, imc;

		System.out.println("Digite seu nome: ");
		String name = scanner.nextLine();

		System.out.println("Insira seu peso (em kg): ");
		weight = scanner.nextFloat();

		System.out.println("Informe sua altura (em metros): ");
		height = scanner.nextFloat();
		imc = weight/Math.pow(height, 2);
		System.out.print("Seu imc é " + imc + " e ");

		if(imc < 18.5) {
			System.out.println(name + ", você está abaixo do peso!");
		} else if(imc < 25) {
			System.out.println(name + ", seu peso é normal!");
		} else if(imc < 30) {
			System.out.println(name + ", você está com sobrepeso!");
		} else if(imc < 35) {
			System.out.println(name + ", você está com obesidade de grau I!");
		} else if(imc < 40) {
			System.out.println(name + ", você está com obesidade de grau II!");
		} else {
			System.out.println(name + ", você está com obesidade móbida (grau III)!");
		}
	}
}