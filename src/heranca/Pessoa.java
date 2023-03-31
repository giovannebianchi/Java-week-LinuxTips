package heranca;

public class Pessoa {
  public static void main(String[] args) {
    PessoaDesenvolvedoraBackend gDevBackend = new PessoaDesenvolvedoraBackend("Giovanne", "Java", 10000.0);
    PessoaDesenvolvedoraFrontend gDevFrontend = new PessoaDesenvolvedoraFrontend("Giovanne", "React", 10000.0);

    gDevBackend.codar();
    gDevFrontend.codar();
  }
}
