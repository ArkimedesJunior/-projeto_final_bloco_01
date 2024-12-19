package projeto_final_bloco_01;

import projeto_final_bloco_cores.Cores;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_RED + Cores.TEXT_BLACK  + Cores.ANSI_BLUE_BACKGROUND);
			
			System.out.println("============================================ ");
			System.out.println("                                             ");
			System.out.println("                MERCADO FREIRE               ");
			System.out.println("                                             ");
			System.out.println("============================================ ");
			System.out.println("                                             ");
			System.out.println("----------------  1-  CADASTRAR -------------");
			System.out.println("                                             ");
			System.out.println("----------------  2-  ATUALIZAR -------------");
			System.out.println("                                             ");
			System.out.println("----------------  3-  LISTAR    -------------");
			System.out.println("                                             ");
			System.out.println("----------------  4-  EXCLUIR   -------------");
			System.out.println("                                             ");
			System.out.println("----------------  5 -  SAIR     -------------");
			System.out.println("                                             ");
			System.out.println("============================================ ");
			System.out.println("                                             ");
			System.out.println("          ESCOLHA A OPÇÃO DESEJADA:          ");
			System.out.println("                                             " + Cores.TEXT_RESET);
			
			
			opcao = leia.nextInt();
			
			if (opcao == 5) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nMERCADO FREIRE - LUGAR DE PREÇO BAIXO, E SÓ AQUI!");
				 sobre();
				leia.close();
				System.exit( 0 );
				
				switch (opcao) {
				case 1 :
					System.out.println(Cores.TEXT_WHITE_BOLD +"CADASTRAR\n\n");
					
					break;
				case 2:
					System.out.println(Cores.TEXT_WHITE_BOLD +"ATUALIZAR\n\n");
					
					break;
				case 3:
					System.out.println(Cores.TEXT_WHITE_BOLD +"LISTAR\n\n");
					
					break;
				case 4:
					System.out.println(Cores.TEXT_WHITE_BOLD +"EXCLUIR\n\n");
					
					break;
					default:
						System.out.println(Cores.TEXT_RED_BOLD +"\nOPÇÃO INVALIDA!\n");
						System.out.println("\nDIGITE UMA OPÇÃO VALIDA!\n");
						
						break;
					
				}
				
			}
		}
		}
			
			public static void sobre() {
			System.out.println("\n==============================================");
			System.out.println("                                                ");
			System.out.println("--Projeto Desenvolvido por: ARKIMEDES JUNIOR--- ");
			System.out.println("                                                ");
			System.out.println("-ARKIMEDES JUNIOR - arkimedesjunior01@gmail.com-");
			System.out.println("                                                ");
			System.out.println("================================================");
			
		
				
			
			
		}

	}


