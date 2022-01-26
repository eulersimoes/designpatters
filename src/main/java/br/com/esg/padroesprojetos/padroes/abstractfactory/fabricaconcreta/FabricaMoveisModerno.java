/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.abstractfactory.fabricaconcreta;

import br.com.esg.padroesprojetos.padroes.abstractfactory.entidades.CadeiraModerna;
import br.com.esg.padroesprojetos.padroes.abstractfactory.entidades.SofaModerno;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ICadeira;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.IFabricaMobilia;
import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ISofa;

/**
 *
 * @author Euler
 */
public class FabricaMoveisModerno implements IFabricaMobilia {

    public ICadeira criarCadeira() {
        return new CadeiraModerna(Double.doubleToLongBits(Math.random()));
    }

    public ISofa criarSofa() {
        return new SofaModerno(Double.doubleToLongBits(Math.random()));
    }
    
}
