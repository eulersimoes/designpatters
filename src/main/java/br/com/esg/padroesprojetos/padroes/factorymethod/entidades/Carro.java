/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.factorymethod.entidades;

import br.com.esg.padroesprojetos.padroes.factorymethod.interfaces.IFabrica;

/**
 *
 * @author Euler
 */
public class Carro implements IFabrica {

    public void dirigir(Long km) 
    {
        System.out.print(String.format("Dirigiu o carro por %d km.",km));
    }
    
}
