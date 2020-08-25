package src;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.text.DecimalFormat;


public class Main {
	static Scanner input = new Scanner(System.in);
	private static List<Cliente> listaCliente = new ArrayList<>();
	private static List<Conta> listaConta = new ArrayList<>();
	private static DecimalFormat df =  new DecimalFormat("###,##0.00"); 
	public static void main(final String[] args) {
		
    int option = -1;
    while(option != 0) {
      System.out.println("==== Escolha uma ação ====");
      System.out.println("[1] Abrir Uma Conta");
      System.out.println("[2] Todos os Clientes");
      System.out.println("[3] Sacar Dinheiro");
      System.out.println("[4] Depositar Dinheiro");
      System.out.println("[5] Extrato Da Conta");
      System.out.println("=========================");
      System.out.println("[0] SAIR DO SISTEMA");
      option = input.nextInt();
			input.nextLine();

			switch(option) {
				case 1:
					cadastroDeCliente();
					break;
				case 2:
          listarClientes();
					break;
				case 3:
          System.out.println("sacando...");
					break;
				case 4:
          System.out.println("depositando...");
					break;
				case 5:
          System.out.println("extrato...");
					break;
				case 0:
					System.out.println("saindo");
					break;
				default:
					System.out.println("Comando Inválido! Tente novamente!");
					break;
			}
		}	
	}
			public static void cadastroDeCliente(){
				String codigo = "", nome = "",email="", telefone="";
				System.out.println("++++++Cadastro De Novo Cliente++++++");
				System.out.println("Qual o código?");
				codigo = input.nextLine();
				System.out.println("Qual o nome?");
				nome = input.nextLine();
				System.out.println("Qual o E-mail?");
				email = input.nextLine();
				System.out.println("Qual o telefone?");
				telefone = input.nextLine();

				Cliente novoCliente = new Cliente();
				novoCliente.setCodigo(codigo);
				novoCliente.setNome(nome);
				novoCliente.setEmail(email);
				novoCliente.setTelefone(telefone);
				
				if (!listaCliente.contains(novoCliente)){
					listaCliente.add(novoCliente);
					System.out.println("Cliente Cadastrado Com Sucesso!");
					}else{
						System.out.println("Já exixte um cliente com esse código.");
					}
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
				System.out.println("Pressione enter para continuar...");
				input.nextLine();
			}

			

		
	}