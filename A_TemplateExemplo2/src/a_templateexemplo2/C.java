package a_templateexemplo2;

import javax.swing.JOptionPane;

public class C extends Projeto{

    public C(int id, String nome) {
        super(id, nome);
    }

    @Override
    void codificacao() {
        JOptionPane.showMessageDialog(null ,"Codificando em C...");
    }

    @Override
    void testes() {
        JOptionPane.showMessageDialog(null ,"Testanto Projeto em C...");
    }

    @Override
    void diagramas() {
       JOptionPane.showMessageDialog(null ,"Fazendo Diagramas...");

    }

    @Override
    void finalizar() {
       JOptionPane.showMessageDialog(null ,"Finalizando Projeto em C...");

    }
    
}
