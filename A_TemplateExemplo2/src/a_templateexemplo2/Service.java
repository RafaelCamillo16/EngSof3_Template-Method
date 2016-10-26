package a_templateexemplo2;

import java.util.ArrayList;
import java.util.List;

public class Service {
    
    List<Projeto> projetos = new ArrayList(); 
    
    public void cadProjetos() {
        projetos.add(new Java(1, "Olá mundo!"));
        projetos.add(new Java(2, "Utilizando a classe ArrayList!"));
        projetos.add(new C(3, "Olá Mundo (Em C...)!"));
        projetos.add(new C(4, "Utilizando alguma classe de C!"));
    
    }
    
    public String listaProjetos() {
    
        String lista = " Veículos: \n";            

        for (int i = 0; i < projetos.size(); i++) {
            lista = lista + "      #." + (i+ 1) + "º Projetos: Id - " + projetos.get(i).getId()
                           + " - Nome: " + projetos.get(i).getNome() +"\n";
               
        }
        return lista;
    
    }
        
}
