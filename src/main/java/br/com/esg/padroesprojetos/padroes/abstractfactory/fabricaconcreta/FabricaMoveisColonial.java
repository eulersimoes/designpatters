/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.abstractfactory.fabricaconcreta;

import br.com.esg.padroesprojetos.padroes.abstractfactory.entidades.CadeiraColonial;
import br.com.esg.padroesprojetos.padroes.abstractfactory.entidades.SofaColonial;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ICadeira;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.IFabricaMobilia;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ISofa;

/**
 *
 * @author Euler
 */
public class FabricaMoveisColonial implements IFabricaMobilia {

    public ICadeira criarCadeira() {
        return new CadeiraColonial(Double.doubleToLongBits(Math.random()));
    }

    public ISofa criarSofa() {
        return new SofaColonial(Double.doubleToLongBits(Math.random()));
    }
    
}
