package heranca;

public class PessoaDesenvolvedoraBackend extends PessoaDesenvolvedora {

  public PessoaDesenvolvedoraBackend(String nome, String stack, Double salario) {
    super(nome, stack, salario);
  }

  @Override
  public void codar() {
    System.out.println("Tô cansado!");
  }
  
}
