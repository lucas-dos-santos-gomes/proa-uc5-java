package comandosdelacos;

public class TestandoFor {
  public static void main(String[] args) {
    for(int i = 1; i <= 10; i++) {
      System.out.println(i + " é um número " + (i % 2 == 0 ? "par" : "ímpar"));
    }
  }
}