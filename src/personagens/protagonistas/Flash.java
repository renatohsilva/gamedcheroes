/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Flash extends Protagonista{

    public Flash(){
        setNome("Flash");
        setQuantidadeVida(3000f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Flash.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.25f);
    }

    @Override
    public Integer getDano() {
        return 388;
    }

    @Override
    public Integer getResistencia() {
        return 69;
    }
    
}
