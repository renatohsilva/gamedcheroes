/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class MulherGaviao extends Protagonista{

    public MulherGaviao(){
        setNome("Mulher Gavião");
        setQuantidadeVida(3800f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/MulherGaviao.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.33f);
    }

    @Override
    public Integer getDano() {
        return 419;
    }

    @Override
    public Integer getResistencia() {
        return 75;
    }
    
}
