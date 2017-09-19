/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class SolomonGrundy extends Antagonista{
    
    public SolomonGrundy(){
        setNome("Solomon Grundy");
        setQuantidadeVida(3800f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/SolomonGrundy.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 339;
    }

    @Override
    public Integer getResistencia() {
        return 80;
    }    
}
