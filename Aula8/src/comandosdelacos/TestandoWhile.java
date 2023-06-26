package comandosdelacos;

public class TestandoWhile {
  public static void main(String[] args) {
    int n = 1;
    while(n <= 10) {
      System.out.println("\nVou imprimir essa frase 10x");
      System.out.println("Número da vez: " + n + "º");
      n++;
    }
    System.out.println("");
    imprimirPares();
  }

  public static void imprimirPares() {
    int n = 2;
    while(n <= 100) {
      System.out.println(n);
      n += 2;
    }
  }
}