/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.abstractfactory.entidades;

import br.com.esg.padroesprojetos.padroes.abstractfactory.interfaces.ISofa;

/**
 *
 * @author Euler
 */
public class SofaColonial implements ISofa {

    public Long id;

    public Boolean transformaCama() {
        return false;
    }
    
    public SofaColonial(){}
    
    public SofaColonial(Long id)
    {
        this.id = id;
    }
    
}
