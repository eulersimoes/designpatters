/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.esg.padroesprojetos.padroes.builder.builders;

import br.com.esg.padroesprojetos.padroes.builder.entidades.Manual;
import br.com.esg.padroesprojetos.padroes.builder.interfaces.IBuilder;

/**
 *
 * @author Euler
 */
public class ManualBuilder  implements IBuilder{

    private Manual manual = new Manual();
    
    public void reset() {
        System.out.println("Reset");
    }

    public void setAssentos(int quantidadeAssentos) {
        manual.quantidadeAssentos = quantidadeAssentos;
    }
    
    public Manual getResult()
    {
        return this.manual;
    }
    
}
