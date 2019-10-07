package aps;
import javax.swing.*;
public class Carro extends Transportes {
    Object[] ops ={"Sim", "Não"};
    Object[] opc ={"2", "3","4"};
     String resp;
     String res; 
    
     public void Preenchimento(){
         super.Preenchimento();
     res = (String) JOptionPane.showInputDialog(null,"Seu veículo possui Vidro e travas eletrica?\n","AUTOMOVEIS",
                JOptionPane.PLAIN_MESSAGE,null,ops,"Sim");
     
     resp= (String) JOptionPane.showInputDialog(null,"Seu veículo possui quanas portas?\n","AUTOMOVEIS",
                JOptionPane.PLAIN_MESSAGE,null,opc,"2");
    }
    
  
    public void ExebirInfo(){
        super.ExebirInfo();
        
         if (res =="Sim"){
             JOptionPane.showMessageDialog(null, "Possui vidros e travas eletrica");
         }else{
             JOptionPane.showMessageDialog(null, "Não possui vidros e travas eletrica");
         }
         
         if(resp == "2"){
             JOptionPane.showMessageDialog(null, "O seu veiculo possui 2 portas");
         }
         if(resp == "3"){
             JOptionPane.showMessageDialog(null, "O seu veiculo possui 3 portas. É um Veloster!");
         }
         if(resp == "4"){
             JOptionPane.showMessageDialog(null, "O seu veiculo possui 4 portas");
         }
        
       
        
    }
}
