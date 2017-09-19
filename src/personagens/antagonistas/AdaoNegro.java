/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.antagonistas;

import personagens.base.Antagonista;
import utilitarios.Enumeraveis.*;

public class AdaoNegro extends Antagonista{
    
    public AdaoNegro(){
        setNome("Adão Negro");
        setQuantidadeVida(3850f);
        setQuantidadeVidaMaxima(getQuantidadeVida());
        setImagem("/imagens/personagens/AdaoNegro.png");
        setClasse(Classe.SuperVilao);
        setAlinhamento(Alinhamento.Antagonista);
    }

    @Override
    public Integer getDano() {
        return 360;
    }

    @Override
    public Integer getResistencia() {
        return 79;
    }
    
}
