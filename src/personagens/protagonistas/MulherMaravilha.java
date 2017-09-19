/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class MulherMaravilha extends Protagonista{

    public MulherMaravilha(){
        setNome("Mulher Maravilha");
        setQuantidadeVida(4100f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/MulherMaravilha.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.33f);
    }

    @Override
    public Integer getDano() {
        return 449;
    }

    @Override
    public Integer getResistencia() {
        return 81;
    }
    
}
