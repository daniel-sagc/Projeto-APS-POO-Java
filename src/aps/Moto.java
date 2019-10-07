package aps;

import javax.swing.JOptionPane;

public class Moto extends Transportes{
    Object[] ops ={"Sim", "Não"};
    String res;
     public void Preenchimento(){
        super.Preenchimento();
        res = (String) JOptionPane.showInputDialog(null,"Sua moto possui Partida eletrica?\n","AUTOMOVEIS",
                JOptionPane.PLAIN_MESSAGE,null,ops,"Sim");
    }
    
    
      public void ExebirInfo(){
        super.ExebirInfo();
      
        
        if (res =="Sim"){
             JOptionPane.showMessageDialog(null, "Sim possui partida eletrica");
         }else{
             JOptionPane.showMessageDialog(null, "Não possui partida eletrica");
         }
      }
}
