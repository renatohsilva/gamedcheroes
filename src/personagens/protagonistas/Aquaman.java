/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.protagonistas;

import personagens.base.Protagonista;
import utilitarios.Enumeraveis.*;

public class Aquaman extends Protagonista{

    public Aquaman(){
        setNome("Aquaman");
        setQuantidadeVida(3600f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Aquaman.png");
        setClasse(Classe.SuperHeroi);
        setAlinhamento(Alinhamento.Protagonista);
    }
    
    @Override
    public Float calcularFatorIncremento() {
       return this.getQuantidadeVida() * (0.25f);
    }

    @Override
    public Integer getDano() {
        return 425;
    }

    @Override
    public Integer getResistencia() {
        return 51;
    }
}
