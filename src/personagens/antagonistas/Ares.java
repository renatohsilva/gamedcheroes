/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Ares extends Antagonista {

    public Ares(){
        setNome("Ares");
        setQuantidadeVida(3900f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Ares.png");
        setClasse(Classe.Bruxo);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
@Override
    public Integer getDano() {
        return 298;
    }

    @Override
    public Integer getResistencia() {
        return 78;
    }
}
