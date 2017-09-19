/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Apocalypse extends Antagonista{
    
    public Apocalypse(){
        setNome("Apocalypse");
        setQuantidadeVida(4000f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Apocalypse.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 369;
    }

    @Override
    public Integer getResistencia() {
        return 91;
    }    
}
