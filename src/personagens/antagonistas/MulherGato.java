/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class MulherGato extends Antagonista {

    public MulherGato(){
        setNome("Mulher Gato");
        setQuantidadeVida(2200f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/MulherGato.png");
        setClasse(Classe.Vilao);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
    @Override
    public Integer getDano() {
        return 210;
    }

    @Override
    public Integer getResistencia() {
        return 53;
    }
}
