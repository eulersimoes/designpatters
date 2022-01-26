/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.builder.builders;

import br.com.esg.padroesprojetos.padroes.builder.entidades.Car;
import br.com.esg.padroesprojetos.padroes.builder.interfaces.IBuilder;

/**
 *
 * @author Euler
 */
public class CarBuilder implements IBuilder{
    
    private Car car = new Car();

    public void reset() {
        System.out.println("Reset");
    }

    public void setAssentos(int quantidadeAssentos) {
        car.numeroAssentos = quantidadeAssentos;
    }
    
    public Car getResult()
    {
        return this.car;
    }
    
}
