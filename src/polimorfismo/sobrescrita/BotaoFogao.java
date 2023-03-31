package polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {
  @Override
  public void ligar() {
    super.ligar();
    System.out.println("Ligue o gás!");
  }

  @Override
  public void desligar() {
    super.desligar();
    System.out.println("Desligue o gás!");
  }
}
