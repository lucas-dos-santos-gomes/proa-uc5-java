import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float particip, caderno, seminario, prova, media;

		System.out.println("Digite o nome do aluno(a): ");
		String nome = scanner.nextLine();

		System.out.println("Digite a nota de participação de " + nome + ": ");
		particip = scanner.nextFloat();
		System.out.println("Digite a nota do caderno de " + nome + ": ");
		caderno = scanner.nextFloat();
		System.out.println("Digite a nota do seminário de " + nome + ": ");
		seminario = scanner.nextFloat();
		System.out.println("Digite a nota de prova de " + nome + ": ");
		prova = scanner.nextFloat();
		media = (particip + caderno + seminario + prova) / 4;
		System.out.println("\nA media de " + nome + " é " + media);
		if(media < 5) {
			System.out.println("Ele está reprovado!");
		} else if(media <= 6) {
			System.out.println("Ele está de recuperação!");
		} else if(media <= 10) {
			System.out.println("Ele está aprovado!");
		} else {
			System.out.println("Você inseriu alguma nota errada!");
		}
	}
}