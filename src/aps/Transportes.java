package aps;

import java.text.DecimalFormat;
import javax.swing.*;

public class Transportes {
    private String Placa;
    private double Tamanho;
    private String Cor;
    private String Fabricante;
    private String Modelo;
    private int Ano;

    public double getTamanho() {
        return Tamanho;
    }

    public String getCor() {
        return Cor;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAno() {
        return Ano;
    }

  

    public void setTamanho(double Tamanho) {
        this.Tamanho = Tamanho;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public void Preenchimento(){
      Placa=(JOptionPane.showInputDialog("Escreva a placa do veículo: "));
      
      Tamanho=Integer.parseInt(JOptionPane.showInputDialog("Escreva o tamanho do veículo (em metros): "));
      Ano=Integer.parseInt(JOptionPane.showInputDialog("Escreva o Ano do veículo: "));
      if(Ano>=1980 && Ano<=2020){
          JOptionPane.showMessageDialog(null, "Ano válido!");
      }else{
          JOptionPane.showMessageDialog(null, "Ano invalido!!!");
      }
      Cor=JOptionPane.showInputDialog("Escreva a cor do veículo: ");
      Fabricante=JOptionPane.showInputDialog("Escreva o Fabricante do veículo: ");
      Modelo=JOptionPane.showInputDialog("Escreva o modelo do veículo: ");
      
    }
 
    public void ExebirInfo(){
      
        JOptionPane.showMessageDialog(null, "O número da placa é: " +Placa + "\nTamanho do veiculo: " + 
                Tamanho+ " m"+ "\nCor do seu veiculo: "+ Cor + "\nFabricado por: "+Fabricante+ "\nModelo: "+Modelo
                +"\nAno: "+Ano,"SEU VEICULO", JOptionPane.INFORMATION_MESSAGE);
    }
}
