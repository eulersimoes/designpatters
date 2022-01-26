/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.factorymethod.classeconcreta;

import br.com.esg.padroesprojetos.padroes.factorymethod.classeabstrata.FabricaDeVeiculo;
import br.com.esg.padroesprojetos.padroes.factorymethod.entidades.Carro;
import br.com.esg.padroesprojetos.padroes.factorymethod.entidades.Moto;
import br.com.esg.padroesprojetos.padroes.factorymethod.interfaces.IFabrica;

/**
 *
 * @author Euler
 */
public class FabricaDeVeiculoConcreta extends FabricaDeVeiculo {

    @Override
    public IFabrica GetVehicle(String veiculo) throws Exception {
        switch (veiculo) {
            case "Moto":
                return new Moto();
            case "Carro":
                return new Carro();
            default:
                throw new Exception(String.format("O veiculo %s não pode ser criado !", veiculo));
        }
    }

}
