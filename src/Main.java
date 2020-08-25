package src;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import src.front.Visual;
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
		Visual.imprimirLogo();
		pausa(3);
    while(option != 0) {
			clrsrc();
			Visual.menu();
      option = input.nextInt();
			input.nextLine();

			switch(option) {
				case 1:
					clrsrc();
					dadosCadastroDeCliente();
					break;
				case 2:
					clrsrc();
					Cliente.listarClientes();
					System.out.println("Pressione enter para continuar...");
					input.nextLine();
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
			public static void dadosCadastroDeCliente(){
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
				Cliente.cadastroDeCliente(codigo, nome, email, telefone);
			}
			public static void clrsrc(){
				try{
					new ProcessBuilder("clear").inheritIO().start().waitFor();
				}catch (Exception ex){
					System.out.println(ex);
				}
			}
			public static void pausa (int tempo){
				try {
					TimeUnit.SECONDS.sleep(tempo);

				}catch(InterruptedException e){
					e.printStackTrace();
				}

			} 

	}