package a_templateexemplo2;

import javax.swing.JOptionPane;

public class Java extends Projeto{

    public Java(int id, String nome) {
        super(id, nome);
    }

    @Override
    void codificacao() {
        JOptionPane.showMessageDialog(null ,"Codificando em Java...");
    }

    @Override
    void testes() {
        JOptionPane.showMessageDialog(null ,"Testanto Projeto em Java com JUnit...");
    }

    @Override
    void diagramas() {
       JOptionPane.showMessageDialog(null ,"Fazendo Diagramas...");

    }

    @Override
    void finalizar() {
       JOptionPane.showMessageDialog(null ,"Finalizando Projeto em Java...");

    }
}
