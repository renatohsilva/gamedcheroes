/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Arlequina extends Antagonista {

    public Arlequina(){
        setNome("Arlequina");
        setQuantidadeVida(2035f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Arlequina.png");
        setClasse(Classe.Vilao);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
    @Override
    public Integer getDano() {
        return 215;
    }

    @Override
    public Integer getResistencia() {
        return 52;
    }
}
