package src;

import java.math.BigDecimal;

public class Conta {
  private String numero;
  private String cliente;
  private BigDecimal saldo;
 
  public String getNumero(){
    return numero;
  }
  public String getCliente(){
    return cliente;
  }
  public BigDecimal getSaldo(){
    return saldo;
  }

  public void setNumero(String numero){
    this.numero = numero;
  }
  public void setCliente(String cliente){
    this.cliente = cliente;
  }
  public void setSaldo(BigDecimal saldo){
    this.saldo = saldo;
  }

  @Override
  public String toString(){
    return String.format("Número da Conta: %s",numero);
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    return result;
  }

  @Override
  public boolean equals (Object obj){
    if(this == obj )
      return true;
    if(obj == null)
      return false;
    if(getClass() != obj.getClass())
      return false;
    Conta other = (Conta) obj;
    if (numero == null){
      if(other.numero != null)
        return false;
    }else if (!numero.equals(other.numero))
      return false;
    return true;
  }
}