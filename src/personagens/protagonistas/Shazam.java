/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Shazam extends Protagonista{

    public Shazam(){
        setNome("Shazam");
        setQuantidadeVida(4000f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Shazam.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.20f);
    }

    @Override
    public Integer getDano() {
        return 400;
    }

    @Override
    public Integer getResistencia() {
        return 80;
    }
    
}
