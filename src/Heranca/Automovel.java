/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Automovel extends Terrestre {
    private String cor;
    private String numPlaca;
    private int numPortas;

    public void imprimirDados(){
        System.out.println("---IMPRESSÃO DE DADOS---");
        System.out.println("Placa: "+numPlaca);
        System.out.println("Cor: "+cor);
        System.out.println("Número de portas: "+numPortas);
        System.out.println("Número de rodas: "+numRodas);
        System.out.println("Capacidade: "+capacidade+" pessoas.");
    }
    
    public Automovel(){
        
    }
    
    
    
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
    
}
