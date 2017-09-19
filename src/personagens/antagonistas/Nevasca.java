/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Nevasca extends Antagonista {

    public Nevasca(){
        setNome("Nevasca");
        setQuantidadeVida(2100f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Nevasca.png");
        setClasse(Classe.Bruxo);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
@Override
    public Integer getDano() {
        return 230;
    }

    @Override
    public Integer getResistencia() {
        return 40;
    }
}
