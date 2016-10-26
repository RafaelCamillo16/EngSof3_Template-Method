package templateexemplo1;

public abstract class Veiculo {
    
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
        
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract void ligar();
    public abstract void assionarEmbrenagem();
    public abstract void engatarMarcha();
    public abstract void desligar();
    
    final void andar(){        
        ligar();
        assionarEmbrenagem();
        engatarMarcha();
        desligar();    
    }
    
    
}
