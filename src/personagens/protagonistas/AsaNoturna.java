/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class AsaNoturna extends Protagonista {

    public AsaNoturna(){
        setNome("Asa Noturna");
        setQuantidadeVida(2000f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/AsaNoturna.png");
        setClasse(Classe.Heroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.14f);
    }

    @Override
    public Integer getDano() {
        return 306;
    }

    @Override
    public Integer getResistencia() {
        return 51;
    }
    
}
