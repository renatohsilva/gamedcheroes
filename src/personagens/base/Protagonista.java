/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.base;

public abstract class Protagonista extends Personagem {

    /**
     * A implementacao deste metodo deve ser diferente para cada classe que o
     * implementar
     *
     * @return Valor inteiro que deve ser passado ao metodo incrementarVida()
     * @see Protagonista#incrementarVida(Personagem, int)
     */
    public abstract Float calcularFatorIncremento();

    /**
     * Este metodo aumenta o valor do atributo quantidadeVida de um personagem
     * de acordo com o metodo calcularFatorIncremento()
     *
     * @param personagem Objeto que tera o valor quantidadeVida aumentado.
     * @param efetividade Valor randomico relativo a efetividade do incremento de vida do personagem.
     * @return Mensagem de texto indicando quem foi o personagem autor do incrmento de vida e quem foi o receptor, 
     * alem de retornar a qual foi a valor da ação e sua efetidade.
     * @see Protagonista#calcularFatorIncremento()
     */
    public String incrementarVida(Personagem personagem, Float efetividade) {
        /* 
        * O personagem que incrementaVida (this) não pode ser o mesmo 
        * que recebe a vida E o personagem não pode estar morto.
        */
        String saida = "";
        String pulaLinha = "\n\n";  
        
        Float qtdAumentoVida = this.calcularFatorIncremento();
        Float qtdAumentoVidaEfetiva = (personagem.getQuantidadeVida() + (qtdAumentoVida * efetividade));
        if (!this.equals(personagem)) {
            if (personagem.getQuantidadeVida() > 0) {                             
                if (qtdAumentoVidaEfetiva > 
                        personagem.getQuantidadeVidaMaxima()) {
                    qtdAumentoVida = personagem.getQuantidadeVidaMaxima() - personagem.getQuantidadeVida();
                    personagem.setQuantidadeVida(personagem.getQuantidadeVidaMaxima());
                    saida += this.getNome() + " aumentou parte da vida de " + 
                            personagem.getNome() + " em " + qtdAumentoVida.toString();
                } else {
                    personagem.setQuantidadeVida(qtdAumentoVidaEfetiva);              
                    saida += this.getNome() + " aumentou parte da vida de " + 
                            personagem.getNome() + " em " + qtdAumentoVida.toString()+" com efetividade de "+efetividade.toString();
                }                
            }
        }
        saida += pulaLinha;
        return saida;
    }
    
     /**
     * O Protagonista causa um dano ao personagem atacado. O metodo reagir() do
     * personagem atacado sera invocado para definir o resultado do ataque.
     *
     * @param atacado Personagem escolhido para ser atacado.
     * @param efetividade Valor randomico relativo a efetividade do ataque do personagem.
     * @return Mensagem de texto indicando se o personagem sofreu o ataque
     * integralmente ou nao, alem de retornar a qual foi a valor da ação e sua efetidade.
     * @see Personagem#reagir(int)
     */
    @Override
    public String atacar(Personagem atacado, Float efetividade) {
        Integer dano = this.getDano();
        String saida = atacado.reagir(dano, efetividade);
        return saida;
    }
}
