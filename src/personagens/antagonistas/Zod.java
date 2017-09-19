/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Zod extends Antagonista{
    
    public Zod(){
        setNome("Zod");
        setQuantidadeVida(4900f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Zod.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 380;
    }

    @Override
    public Integer getResistencia() {
        return 98;
    }    
}
