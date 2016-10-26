package a_templateexemplo2;

import javax.swing.JOptionPane;

public class View {
    
    public void menu() {
    
        Projeto java = new Java(0, "java");
        Projeto c = new C(1, "c");
        
        Service service = new Service();
        service.cadProjetos();
              
        int escolha = 0;
        do {
        
       escolha = Integer.parseInt(JOptionPane.showInputDialog( null ,"------- Bem Vindo! --------- \n"
               + "1. Listar Projetos  \n"
               + "2. Desenvolver em Java \n" 
               + "3. Desenvolver em C \n"
             //  + "4. Teste \n"
               + "0. Sair \n" 
               + "Digite uma opção"));
        
            switch (escolha) {

                case 1:
                    JOptionPane.showMessageDialog(null,service.listaProjetos());
                    break;

                case 2:
                    java.development();
                    break;

                case 3:
                    c.development();
                    break;                  
                                  
                case 0:
                    System.exit(0);
                    break;    
                    
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.");
                    break;

            }

        }  while (escolha != 0); {
             JOptionPane.showMessageDialog(null, "Fim!");
    }
            
    }
    
}
