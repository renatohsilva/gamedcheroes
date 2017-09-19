/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

/**
 *
 * @author rafael
 */
public enum Dificuldade {
    
    FACIL(0.8f),
    NORMAL(1.0f),
    DIFICIL(1.5f),
    INSANO(2.0f);
    
    private Float multiplicador;
    
    Dificuldade(Float multiplicador){
        this.multiplicador = multiplicador;
    } 
    
    public Float getMultiplicador(Dificuldade dificuldade){
        return this.multiplicador;
    }
}
