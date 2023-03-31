package abstracao;

public class LinuxTipsBankMain {
  public static void main(String[] args) {
    
    System.out.println("Seja bem vinda ao linux tips bank");
    ContaCorrente ccGiovanne = new ContaCorrente();  
    ccGiovanne.consultarSaldo();
    ccGiovanne.fazerPix();
    
    ContaPoupanca cpGiovanne = new ContaPoupanca(); 
    cpGiovanne.consultarSaldo();
    cpGiovanne.fazerPix();
  }
}
