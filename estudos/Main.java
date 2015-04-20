package estudos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
      
        //FORNECEDOR
        Fornecedor RCEntregas = new Fornecedor("RCEntregas", "00-000-000-0000-00", "Rua teste", "Jataí-GO");
        
        Fornecedor FMExpress = new Fornecedor("FMExpress", "01-236-985-9874-99", "Rua 1", "Cassilandia-MS");
        
        Fornecedor Teste = new Fornecedor("Teste", "25-989-541-3652-12", "Rua Goiania", "Goiania-GO");
        
        //TIPO DE MIDIA
        
        TipoDeMidia DVD = new TipoDeMidia("DVD");
        
        TipoDeMidia CD = new TipoDeMidia("CD");
        
        TipoDeMidia Bluray = new TipoDeMidia("Bluray");
        
        //LISTA DE TIPO DE MIDIA
        
        List<TipoDeMidia> Midia = new ArrayList<>();
        Midia.add(CD);
        Midia.add(DVD);
        Midia.add(Bluray);
        
        //OBJETOS
        
        Locadora teste = new Locadora();
        teste.setCodigoLivro(01);
        teste.setDescricao("Teste");
        teste.setFornecedor(RCEntregas);
        teste.setIdioma("Ingles");
        teste.setLegenda("Portugues");
        teste.setObservacao("Nada");
        teste.setTipoDeMidia(Midia);
        teste.setVlCompra(10);
        teste.setStatus("ativo");
        
        //Locadora teste = new Locadora(01, "Java", 10, "Inglês", "Português", RCEntregas, Midia, "tomara que funcione", "Ativo");
        
        teste.setCodigoLivro(Integer.parseInt(JOptionPane.showInputDialog("O código do livro é:")));
        teste.setDescricao(JOptionPane.showInputDialog("A descrição é:"));
        teste.setFornecedor(RCEntregas);
        teste.setIdioma(JOptionPane.showInputDialog("O idioma é:"));
        teste.setLegenda(JOptionPane.showInputDialog("A legenda é:"));
        teste.setObservacao(JOptionPane.showInputDialog("Informe a observação:"));
        teste.setStatus(JOptionPane.showInputDialog("Informe o status:"));
        teste.setTipoDeMidia(Midia);
        teste.setVlCompra(Double.parseDouble(JOptionPane.showInputDialog("O preço de compra é:")));
        
        JOptionPane.showMessageDialog(null, "Código:" + " " + teste.getCodigoLivro() + "\n" + "Descrição:" + " " + teste.getDescricao()+ "\n" + " Idioma:" + " " + teste.getIdioma() + "\n" + "Legenda:" + " " + teste.getLegenda() + "\n" + "Observação:" + " " + teste.getObservacao() + "\n" + "Status:" + " " + teste.getStatus() + "\n" + "Fornecedor:" + " " + teste.getFornecedor());
        
        //teste.MostrarDados();
        
        /*for (int i = 0; i < Midia.size(); i++) {
            Midia.get(i).getDescricaoMidia();    
        }*/
        
        for (TipoDeMidia tipoDeMidia2 : Midia) {
            JOptionPane.showMessageDialog(null, tipoDeMidia2.getDescricaoMidia());
           
            
        }
    }
    
}
