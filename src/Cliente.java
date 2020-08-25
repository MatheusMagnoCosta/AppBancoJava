package src;
import java.util.ArrayList;
import java.util.List;
import src.front.Alertas;

public class Cliente {
  private String codigo;
  private String nome;
  private String email;
  private String telefone;
  private static List<Cliente> listaCliente = new ArrayList<>();

  public String getCodigo(){
    return codigo;
  }
  public String getNome(){
    return nome;
  }
  public String getEmail(){
    return email;
  }
  public String getTelefone(){
    return telefone;
  }

  public void setCodigo(String codigo){
    this.codigo = codigo;
  }
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  @Override
  public String toString(){
    return String.format("%s (%s)",nome,email);
  }

  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
    Cliente other = (Cliente) obj;
    if (codigo == null){
      if(other.codigo != null)
        return false;
    }else if (!codigo.equals(other.codigo))
      return false;
    return true;
  }

  public static void cadastroDeCliente(String codigo,String nome,String email,String telefone){
    Cliente novoCliente = new Cliente();
    novoCliente.setCodigo(codigo);
    novoCliente.setNome(nome);
    novoCliente.setEmail(email);
    novoCliente.setTelefone(telefone);
    
    if (!listaCliente.contains(novoCliente)){
      listaCliente.add(novoCliente);
        Alertas.cadastradoSucesso();
      }else{
        Alertas.jaCadastrado();
      }
      Main.pausa(3);
    }

    public static void listarClientes(){
      System.out.println("========= = Todos Os Clientes Cadastrados = =========");
      System.out.println(String.format("%6s %-30s %-30s %-20s", "código", "Nome", "E-mail", "Telefone"));
      for (Cliente cliente:listaCliente){
        System.out.println(String.format("%6s %-30s %-30s %-20s",
        cliente.getCodigo(),
        cliente.getNome(),
        cliente.getEmail(),
        cliente.getTelefone()));
      }
    }

}