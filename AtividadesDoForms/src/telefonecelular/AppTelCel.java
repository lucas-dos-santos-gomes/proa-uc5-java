package telefonecelular;

public class AppTelCel {
  public static void main(String[] args) {
    TelefoneCelular mobile1 = new TelefoneCelular("Apple", 256, 12);
    mobile1.status();
    
    TelefoneCelular mobile2 = new TelefoneCelular("Samsung", 128, 6);
    mobile2.ligar();
    mobile2.setPorcentagemBateria(97);
    mobile2.status();
  }
}