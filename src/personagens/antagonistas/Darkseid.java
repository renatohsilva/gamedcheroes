/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class Darkseid extends Antagonista{
    
    public Darkseid(){
        setNome("Darkseid");
        setQuantidadeVida(4300f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/Darkseid.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 358;
    }

    @Override
    public Integer getResistencia() {
        return 89;
    }
    
}
