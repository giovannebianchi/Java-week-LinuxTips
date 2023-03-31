package heranca;

public class PessoaDesenvolvedoraFrontend extends PessoaDesenvolvedora {

  public PessoaDesenvolvedoraFrontend(String nome, String stack, Double salario) {
    super(nome, stack, salario);
  }

  @Override
  public void codar() {
    System.out.println("Tô bebendo!");
  }
}
