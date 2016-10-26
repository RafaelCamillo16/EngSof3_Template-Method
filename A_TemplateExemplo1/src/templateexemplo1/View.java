package templateexemplo1;

import java.util.Scanner;

public class View {

    public void menu() {

        Scanner entrada = new Scanner(System.in);
        Veiculo veiculo = new Moto("moto");
        Veiculo veiculo2 = new Carro("Carro");

        Service service = new Service();

        int escolha = 0;
        do {
        
        System.out.println("------- Bem Vindo! ---------");
        System.out.println("1. Listar Veículos ---------");
        System.out.println("2. Andar de Moto -----------");
        System.out.println("3. Andar de Carro ----------");
        //System.out.println("4. Teste -------------------");
        System.out.println("0. Sair --------------------");

        escolha = entrada.nextInt();
        service.cadVeiculo();
       
            switch (escolha) {

                case 1:
                    System.out.println(service.listaVeiculos());
                    break;

                case 2:
                    veiculo.andar();

                    break;

                case 3:
                    veiculo2.andar();
                    break;
//
//                case 4:
//                    System.out.println(service.selecionarVeiculo());                    
//                    int selec = entrada.nextInt();
//                    
//                    break;
            }

        }  while (escolha != 0); {
        
            System.out.println("-------------------------------");
            System.out.println("Fim");
        
    }
        
        } 

    }
