package a_templateexemplo2;

public abstract class Projeto {
    
     private int id;
     private String nome;
     
     abstract void codificacao();
     abstract void testes();
     abstract void diagramas();     
     abstract void finalizar();

    public Projeto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }        
     
     final void development() {
         diagramas();
         codificacao();
         testes();
         finalizar();         
     }
 
 }
