/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Cyborg extends Protagonista {
    
    public Cyborg(){
        setNome("Cyborg");
        setQuantidadeVida(3200f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Cyborg.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }

    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.20f);
    }

    @Override
    public Integer getDano() {
        return 465;
    }

    @Override
    public Integer getResistencia() {
        return 66;
    }
    
}
