import java.util.Scanner; // Biblioteca de saída

public class SegundoTeste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8"); // Entrada pelo teclado
		String name, education, demoDayRole;
		int age;

		System.out.println("Meu segundo programa em Java! Uhhuul!"); // Printa com quebra de linha
		System.out.println("Digite seu nome: ");
		name = scanner.nextLine(); // nextLine => string
		System.out.println("\nDigite sua idade: ");
		age = scanner.nextInt(); // nextInt => int
		scanner.nextLine();
		System.out.println("\nInsira sua formação acadêmica: ");
		education = scanner.nextLine();
		System.out.println("\nInforme sua função no Demo Day: ");
		demoDayRole = scanner.nextLine();
		System.out.println("\nBem vindo(a) " + name);
		System.out.println("Você tem " + age + " anos!");
		System.out.println("É " + education + " e sua função no Demo Day é " + demoDayRole);
	}
}