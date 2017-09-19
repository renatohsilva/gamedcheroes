/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Ajax extends Protagonista {
    
    public Ajax(){
        setNome("Ajax");
        setQuantidadeVida(2400f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Ajax.jpg");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }

    @Override
    public Float calcularFatorIncremento() {
        return getQuantidadeVida() * (0.25f);
    }

    @Override
    public Integer getDano() {
        return 365;
    }

    @Override
    public Integer getResistencia() {
        return 56;
    }
    

}
