package festadeaniversario;

public class FestaDeAniversario {
  String nomeAniversariante;
  int idadeAniversariante;
  String local;
  int numeroConvidados;
  boolean temBolo;

  public FestaDeAniversario(String nome, int idade, String local, int convidados) {
    this.setNomeAniversariante(nome);
    this.setIdadeAniversariante(idade);
    this.setLocal(local);
    this.setNumeroConvidados(convidados);
  }

  public String getNomeAniversariante() {
    return this.nomeAniversariante;
  }

  public void setNomeAniversariante(String nome) {
    this.nomeAniversariante = nome;
  }

  public int getIdadeAniversariante() {
    return this.idadeAniversariante;
  }

  public void setIdadeAniversariante(int idade) {
    this.idadeAniversariante = idade;
  }

  public String getLocal() {
    return this.local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public int getNumeroConvidados() {
    return this.numeroConvidados;
  }

  public void setNumeroConvidados(int convidados) {
    this.numeroConvidados = convidados;
  }

  public boolean getTemBolo() {
    return this.temBolo;
  }

  public void confirmarBolo() {
    this.temBolo = true;
  }

  public void cancelarBolo() {
    this.temBolo = false;
  }

  public void informacoes() {
    System.out.println("\nInformações da festa");
    System.out.println(" = Aniversariante: " + this.getNomeAniversariante());
    System.out.println(" = Idade do aniversariante: " + this.getIdadeAniversariante() + " anos");
    System.out.println(" = Local da festa: " + this.getLocal());
    System.out.println(" = Número de convidados: " + this.getNumeroConvidados() + " pessoas");
    System.out.println(" = Essa festa" + (this.getTemBolo() ? "" : " não") + " terá bolo");
  }
}