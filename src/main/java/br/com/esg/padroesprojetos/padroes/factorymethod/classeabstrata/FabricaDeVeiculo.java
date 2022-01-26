/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.factorymethod.classeabstrata;

import br.com.esg.padroesprojetos.padroes.factorymethod.interfaces.IFabrica;

/**
 *
 * @author Euler
 */
public abstract class FabricaDeVeiculo {
    
    public abstract IFabrica GetVehicle(String veiculo) throws Exception;
    
}
