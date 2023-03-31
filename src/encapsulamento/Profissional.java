package encapsulamento;

/**
* Profissional
*/
public class Profissional {
  // Gerar modificador de acesso
  public Double getSalario() {
    return salario;
  }

  public void setSalario(Double salario) {
    this.salario = salario;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  // End gerar modificador de acesso

  // Private: Só são visíveis dentro da classe que estão
  private Double salario;
  private Integer id;
  
  // Acessíveis por qualquer classe
  public Double salarioPublic;
  public Integer idPublic;
  
  // Acessíveis pela classe que o declara, pelas subclasses que irão herdar a classe Profissional e outras classes dentro do mesmo pacote
  
  protected Double salarioProtected;
  protected Integer idProtected;
  
  public String trabalharPublic() {
    return "trabalhando public";    
  }

  protected String trabalharProtected() {
    return "trabalhando protected";
  }

  private String trabalharPrivate() {
    return "trabalhando private ";
    
  }
}