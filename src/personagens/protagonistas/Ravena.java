/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Ravena extends Protagonista {

    public Ravena(){
        setNome("Ravena");
        setQuantidadeVida(2700f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Ravena.png");
        setClasse(Classe.Mago);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.25f);
    }

    @Override
    public Integer getDano() {
        return 395;
    }

    @Override
    public Integer getResistencia() {
        return 68;
    }

}
