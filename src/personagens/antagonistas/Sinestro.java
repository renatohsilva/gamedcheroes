/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Sinestro extends Antagonista {

    public Sinestro(){
        setNome("Sinestro");
        setQuantidadeVida(3640f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Sinestro.png");
        setClasse(Classe.Bruxo);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
@Override
    public Integer getDano() {
        return 294;
    }

    @Override
    public Integer getResistencia() {
        return 70;
    }
}
