package encapsulamento;

public class ProfissionalMain {
  public static void main(String[] args) {
    Profissional profissional = new Profissional();

    profissional.idPublic = 1;
    profissional.trabalharPublic();
    profissional.salarioProtected = 1234.0;

    System.out.println(profissional.salarioProtected);

    profissional.setId(1);
    System.out.println(profissional.getId());
  }
}
