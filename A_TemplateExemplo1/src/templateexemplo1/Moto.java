package templateexemplo1;

public class Moto extends Veiculo{

    public Moto(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {        
        System.out.println("Ligando a Moto... ");
    }

    @Override
    public void assionarEmbrenagem() {
        System.out.println("Embregem..");
    }

    @Override
    public void engatarMarcha() {
        System.out.println("Marcha... Track...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Moto..");
    }
    
}
