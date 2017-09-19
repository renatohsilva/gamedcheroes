/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Bane extends Antagonista {

    public Bane(){
        setNome("Bane");
        setQuantidadeVida(4120f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Bane.png");
        setClasse(Classe.Vilao);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
    @Override
    public Integer getDano() {
        return 310;
    }

    @Override
    public Integer getResistencia() {
        return 69;
    }    
}
