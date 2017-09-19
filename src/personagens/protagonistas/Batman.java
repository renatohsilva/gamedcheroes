/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Batman extends Protagonista {

    public Batman(){
        setNome("Batman");
        setQuantidadeVida(2300f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Batman.PNG");
        setClasse(Classe.Heroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.33f);
    }

    @Override
    public Integer getDano() {
        return 436;
    }

    @Override
    public Integer getResistencia() {
        return 87;
    }
    
}
