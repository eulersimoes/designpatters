/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.builder.diretor;

import br.com.esg.padroesprojetos.padroes.builder.interfaces.IBuilder;

/**
 *
 * @author Euler
 */
public class Diretor {

    public void makeSportCar(IBuilder ibuilder) {
        ibuilder.setAssentos(2);
    }

    public void makeSuv(IBuilder ibuilder) {
        ibuilder.setAssentos(5);
    }

}
