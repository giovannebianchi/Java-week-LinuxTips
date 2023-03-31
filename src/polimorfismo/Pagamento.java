package polimorfismo;

// Sobrecarga

public class Pagamento {
  // Pagamento a vista
  public Double pagamento(Double valor) {
    return valor;
  }

  // Calcula valor das parcelas
  public Integer pagamento(Integer valorInteger, Integer parcelas) {
    return valorInteger/parcelas;
  }

  // Juros
  public Long pagamento(Integer valorInteger, Integer parcelas, Long juros) {
    return (valorInteger/parcelas)+juros;
  }
}
