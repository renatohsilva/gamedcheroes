/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.base;

public abstract class Antagonista extends Personagem
{

    private static final Integer PODER_ATAQUE = 2;

    /**
     * Todo ataque tem como reacao a defesa do personagem atacado. Desse modo, o metodo reagir()
     * do personagem atacado sera invocado.
     * O Antagonista tem o valor de dano dobrado ao atacar. 
     * @param atacado Personagem escolhido para ser atacado.
     * @param efetividade Valor randomico relativo a efetividade do ataque do personagem.
     * @return Mensagem de texto indicando se o personagem sofreu o ataque integralmente ou parcialmente, 
     * alem de retornar a qual foi a valor da ação e sua efetidade.
     * @see Personagem#reagir(int)
     */
    @Override
    public String atacar (Personagem atacado, Float efetividade)
    {
        Integer dano = (this.getDano() * PODER_ATAQUE);
        String saida = atacado.reagir(dano, efetividade);
        return saida;
    }
}