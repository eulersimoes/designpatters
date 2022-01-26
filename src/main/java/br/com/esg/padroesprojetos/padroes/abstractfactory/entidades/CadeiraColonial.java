/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.abstractfactory.entidades;

import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ICadeira;

/**
 *
 * @author Euler
 */
public class CadeiraColonial implements ICadeira{

    public Long id;
        
    public Boolean temPernas() {
        return true;
    }
    
    public CadeiraColonial(){}
    
    public CadeiraColonial(Long id)
    {
        this.id = id;
    }

    
}
