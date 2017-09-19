/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Exterminador extends Antagonista {

    public Exterminador(){
        setNome("Exterminador");
        setQuantidadeVida(2180f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Exterminador.png");
        setClasse(Classe.Vilao);
        setAlinhamento(Alinhamento.Antagonista);
    }
    
    @Override
    public Integer getDano() {
        return 298;
    }

    @Override
    public Integer getResistencia() {
        return 63;
    }
}
