package polimorfismo.sobrescrita;

public class BotaoTV extends Botao {
  @Override
  public void ligar() {
    super.ligar();
    System.out.println("Ligue a TV!");
  }
  
  @Override
  public void desligar() {
    super.desligar();
    System.out.println("Desligue a TV em 20 minutos!");
  }
}
