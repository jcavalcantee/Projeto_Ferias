package Menu;
import java.util.Scanner;
import Menu.InfoMenu.Informacoes;

public class MenuInicial {
    Scanner sc = new Scanner(System.in);

    public void menuPrincipal(){
        boolean sair = false;
        do {
            System.out.println("\n--------------------------------------------------------------------------------------------\n");
            System.out.println("|============================|");
            System.out.println("|     LANCHONETE DOS CRIA    |");
            System.out.println("\n|============================|");
            System.out.println("|       MENU DE OPÇÕES       |");
            System.out.println("|============================|");
            System.out.println("|    1- Informações          |");
            System.out.println("|    2- Cardápio             |");
            System.out.println("|    3- Lançamentos          |");
            System.out.println("|    4- Trabalhe conosco     |");
            System.out.println("|    5- Sair                 |");
            System.out.println("|============================|");
            System.out.print("Digite sua opção: ");

            int opcao = sc.nextInt();

            switch (opcao) {
			case 1:
                Menu.InfoMenu.Informacoes();
                break;
            
                

        } while(sair == false);
    }

    
}

