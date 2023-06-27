package festadeaniversario;

public class AppFesta {
  public static void main(String[] args) {
    FestaDeAniversario primeiraFesta = new FestaDeAniversario("Arthur", 15, "Buffet", 32);
    primeiraFesta.confirmarBolo();
    primeiraFesta.informacoes();

    FestaDeAniversario segundaFesta = new FestaDeAniversario("Maria Eduarda", 20, "Bar", 5);
    segundaFesta.setLocal("churrascaria");
    segundaFesta.informacoes();
  }
}