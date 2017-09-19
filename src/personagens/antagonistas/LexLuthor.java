/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class LexLuthor extends Antagonista{
    
    public LexLuthor(){
        setNome("Lex Luthor");
        setQuantidadeVida(2780f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/LexLuthor.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 397;
    }

    @Override
    public Integer getResistencia() {
        return 75;
    }    
}
