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
public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNumPlaca("23JH45");
        carro.setNumPortas(4);
        carro.setCor("Branco");
        carro.setNumRodas(4);
        carro.setCapacidade(5);
        
        moto.setNumPlaca("293847839");
        moto.setNumPortas(0);
        moto.setCor("Preto");
        moto.setNumRodas(2);
        moto.setCapacidade(2);
        
        carro.imprimirDados();
        System.out.println("");
        moto.imprimirDados();
    }
}
