package src.front;

public class Alertas {

  private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
  private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
  private static final String ANSI_BLACK = "\u001B[30m";
  private static final String ANSI_RESET = "\u001B[0m";

  public static void jaCadastrado(){
    System.out.println(ANSI_RED_BACKGROUND+ANSI_BLACK+"Um Usuario Já possui esse Código"+ANSI_RESET);
    System.out.println("Tente Novamente");
  }

  public static void cadastradoSucesso(){
    System.out.println(ANSI_GREEN_BACKGROUND+ANSI_BLACK+"Cliente Cadastrado Com Sucesso!"+ANSI_RESET);
  } 
}