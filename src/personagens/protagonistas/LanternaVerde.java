/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class LanternaVerde extends Protagonista {

    public LanternaVerde(){
        setNome("Lanterna Verde");
        setQuantidadeVida(3650f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/LanternaVerde.png");
        setClasse(Classe.Mago);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.17f);
    }

    @Override
    public Integer getDano() {
        return 436;
    }

    @Override
    public Integer getResistencia() {
        return 79;
    }    
}
