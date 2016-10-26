package templateexemplo1;

import java.util.ArrayList;
import java.util.List;

public class Service {
    
    List<Veiculo> veiculos = new ArrayList();    
    
    public void cadVeiculo(){
        veiculos.add(new Carro("Uno com Escada no Teto"));         
        veiculos.add(new Carro("Honda Civic"));
        veiculos.add(new Moto("Fazer 250"));
        veiculos.add(new Moto("Cg Titan 150"));
     
    }
    
//    public String selecionarVeiculo(){
//       String selec;
//       int id;
//       int i;
//       
//       for(i = 0; i < veiculos.size(); i++) {
//       
//           System.out.printf("Posição: ", i, veiculos.get(i));       
//       }       
//        System.out.println("Informe o veículo a ser usado");       
//        selec = veiculos.get(i).getModelo().toString();
//        return selec;
//    
//    }
      
    public String listaVeiculos(){
       String lista = " Veículos: \n";            

        for (int i = 0; i < veiculos.size(); i++) {
            lista = lista + "      #." + (i+ 1) + "º Veículo " +veiculos.get(i).getModelo()+ "\n";
               
        }
        return lista;
       
    }
      
}
