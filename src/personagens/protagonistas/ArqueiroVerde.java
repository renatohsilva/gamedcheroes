/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class ArqueiroVerde extends Protagonista{

    public ArqueiroVerde(){
        setNome("Arqueiro Verde");
        setQuantidadeVida(2200f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/ArqueiroVerde.png");
        setClasse(Classe.Heroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.14f);
    }

    @Override
    public Integer getDano() {
        return 292;
    }

    @Override
    public Integer getResistencia() {
        return 42;
    }
}
