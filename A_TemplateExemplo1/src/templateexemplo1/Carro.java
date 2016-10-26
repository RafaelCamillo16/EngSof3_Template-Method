package templateexemplo1;

public class Carro extends Veiculo{

    public Carro(String modelo) {
        super(modelo);
    }
  
    @Override
    public void ligar() {
        System.out.println("Ligando o Carro...");
    }

    @Override
    public void assionarEmbrenagem() {
        System.out.println("Embreagem..");
    }    

    @Override
    public void engatarMarcha() {
        System.out.println("Traaaaaa");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Carro");
    }
    
}
