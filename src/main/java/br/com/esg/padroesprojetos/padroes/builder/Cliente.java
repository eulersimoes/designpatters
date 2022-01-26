package br.com.esg.padroesprojetos.padroes.builder;


import br.com.esg.padroesprojetos.padroes.builder.builders.CarBuilder;
import br.com.esg.padroesprojetos.padroes.builder.diretor.Diretor;
import br.com.esg.padroesprojetos.padroes.builder.entidades.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Euler
 */
public class Cliente {

    public Cliente() {

    }
    
    public void ExecutarExemplo()
    {
        Diretor diretor = new Diretor();
        CarBuilder builder = new CarBuilder();
        Car car;
        diretor.makeSportCar(builder);
        car = builder.getResult();
    }
}
