package aps;
import javax.swing.*;

public class Aps {

    public static void main(String[] args) {
        int resposta=0;
        while(resposta !=1){
        Transportes transporte = null;
        Object[] op ={"Carro", "Moto", "Caminhão"};
        String resp = (String) JOptionPane.showInputDialog(null,"Selecione  seu veículo:\n","AUTOMOVEIS",
                JOptionPane.PLAIN_MESSAGE,null,op,"Carro");
        
                    if(resp==null){
                        System.exit(0);
                    }
                    
                    if (resp=="Carro"){
                            transporte = new Carro(); 
                            transporte.Preenchimento();
                           
                    }
                    
                    if (resp=="Moto"){
                            transporte = new Moto(); 
                            transporte.Preenchimento();
                         }
                    
                     if (resp=="Caminhão"){
                            transporte = new Caminhao(); 
                            transporte.Preenchimento();
                         }
                  transporte.ExebirInfo();
                  resposta = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro veículo?","Confirmação",JOptionPane.YES_NO_OPTION);
        }
      
    }
    
}
