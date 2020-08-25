package src.front;

public class Visual {
  private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
  private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
  public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_BLACK = "\u001B[30m";


  public static void imprimirLogo(){
    System.out.println(ANSI_BLACK + ANSI_YELLOW_BACKGROUND+"--------------------------------------------------");
    System.out.println("--------------------------------------------------");
    System.out.println("-----------------------:++:----------------:+:----");
    System.out.println("--------------------:+yhhhhy+:----------:+shh:----");
    System.out.println("-----------------:+yhhhhhhhhhhy+:----:+shhhhh:----");
    System.out.println("--------------:+yhhhhhhs//shhhhhhy+:-/shhhhs/-----");
    System.out.println("-----------:+yhhhhhyo/------/shhhhhhy+:-+/--------");
    System.out.println("--------:+yhhhhhhhhy+:------:--+shhhhhhy+:--------");
    System.out.println("-----:+yhhhhhhhhhhhhhho--:oyhhs+--+shhhhhhy+:-----");
    System.out.println("-----/oyhhhhhhhhhhhs+-:+yhhhhhyo:-/ohhhhhhho/-----");
    System.out.println("--------/oyhhhhhs+::+yhhhhhyo/-:oyhhhhhhs/--------");
    System.out.println("-----------/os+::+yhhhhhho/-:+yhhhhhhs/-----------");
    System.out.println("-------------:+yhhhhhhs/-:+yhhhhhhs/--------------");
    System.out.println("----------:+yhhhhhhs+--+shhhhhhs/-:oys+:----------");
    System.out.println("-------:+shhhhhhs+--+shhhhhhs/-:oyhhhhhhs+:-------");
    System.out.println("-----/shhhhhhh+:-:shhhhhhs/-:oyhhhhhhhhhhhhs+-----");
    System.out.println("------/ohhhhhhyo/-:oyhs+---ohhhhhhhhhhhhhhs/------");
    System.out.println("---------/ohhhhhhyo:---------/shhhhhhhhs/---------");
    System.out.println("-------:+o/-/ohhhhhhyo:-----+shhhhhhs/------------");
    System.out.println("-----+yhhhhy+--/ohhhhhhyo+yhhhhhhs/---------------");
    System.out.println("-----hhhhho/------/ohhhhhhhhhhs/------------------");
    System.out.println("-----hho/------------/ohhhhs/---------------------");
    System.out.println("-----/------------------//------------------------");
    System.out.println("--------------------------------------------------");
    System.out.println("--------------------------------------------------"+ANSI_RESET);
  }
  public static void menu(){
    System.out.println(ANSI_BLACK + ANSI_WHITE_BACKGROUND+"==== Escolha uma ação ===="+ANSI_RESET);
    System.out.println("[1] Abrir Uma Conta");
    System.out.println("[2] Todos os Clientes");
    System.out.println("[3] Sacar Dinheiro");
    System.out.println("[4] Depositar Dinheiro");
    System.out.println("[5] Extrato Da Conta");
    System.out.println("=========================");
    System.out.println("[0] SAIR DO SISTEMA");
  }
  
}