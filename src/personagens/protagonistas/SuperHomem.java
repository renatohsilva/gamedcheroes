/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class SuperHomem extends Protagonista{

    public SuperHomem(){
        setNome("Super Homem");
        setQuantidadeVida(5000f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/SuperHomem.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
        return this.getQuantidadeVida() * (0.5f);
    }

    @Override
    public Integer getDano() {
        return 500;
    }

    @Override
    public Integer getResistencia() {
        return 100;
    }
}
