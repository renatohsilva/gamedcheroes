/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.base;

import static utilitarios.Utilitarios.*;
import utilitarios.Enumeraveis.*;
        
public abstract class Personagem
{
    private String nome;
    private Float quantidadeVida;
    private Float quantidadeVidaMaxima;
    private String imagem;
    private Classe classe;
    private Alinhamento alinhamento;
        
    /**
     * @return O valor do atributo dano da classe concreta
     */
    public abstract Integer getDano();
	
    /**
     * @return O valor do atributo resistencia da classe concreta
     */
    public abstract Integer getResistencia(); 

    public abstract String atacar (Personagem atacado, Float efetividade);

    /**
     * Metodo invocado quando um personagem sofre ataque. 
     * Este metodo decide aleatoriamente se o personagem atacado
     * tera a quantidade de vida aumentada apos o ataque 
     * conforme o valor definido pelo atributo resistencia.
     * 
     * @param reducao Valor que deve ser subtraido de quantidadeVida
     * @param efetividade Valor randomico relativo a efetividade do ataque do personagem.
     * @return Mensagem de texto indicando se o personagem atacado sofreu integralmente o dano do atacante ou se houve uma resistencia.
     * @see Protagonista#atacar(Personagem)
     * @see Antagonista#atacar(Personagem)
     */
    public String reagir(Integer reducao, Float efetividade)
    {
        String saida;
        boolean defesa = getRandomBoolean();
        
        saida = sofrerDano(reducao, defesa, efetividade); //diminui a quantidade de vida
        return saida;
    }
    
    
    private String sofrerDano(Integer reducao, boolean defesa, Float efetividade)
    {
        String pulaLinha = "\n\n"; 
        String saida;
        saida = this.getNome() + " sofreu dano com efetividade de "+ efetividade.toString();
        if (efetividade == 1.0f) {
            saida+=" (Dano crítico!)";
        }

        Float reducaoFloat = reducao * efetividade;
        if (efetividade == 1.0) {
            reducaoFloat = reducaoFloat * ((float)2.0);//Critical
        } 
        
        Float quantidadeReduzida;

        if ((this.getQuantidadeVida() - reducaoFloat) < 0.0) {
            quantidadeReduzida = 0.0f;
        } else {
            quantidadeReduzida = (this.getQuantidadeVida() - reducaoFloat);
        }
        
        this.setQuantidadeVida(quantidadeReduzida);
        //depois de sofrer o dano verifica aleatoriamente se haverá uma recuperação
        if (defesa && (efetividade != 0.0)) {
            if ((this.getQuantidadeVida() + this.getResistencia()) > this.getQuantidadeVidaMaxima()) {
                this.setQuantidadeVida(this.getQuantidadeVidaMaxima());//ameniza o ataque aumentando um pouco mais o valor do tempo de vida.
                saida += pulaLinha;
            } else {
                this.setQuantidadeVida(this.getQuantidadeVida() + this.getResistencia());//ameniza o ataque aumentando um pouco mais o valor do tempo de vida.
                saida += ", mas se defendeu." + pulaLinha;
            }
            
        } else {
            saida += "." + pulaLinha;
        }
 
        return saida;
    }

    public String getNome() 
    {
        return nome;
    }
    
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    
    public Float getQuantidadeVida() 
    {
        return quantidadeVida;
    }
    
    public void setQuantidadeVida(Float quantidadeVida) 
    {
        this.quantidadeVida = quantidadeVida;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Alinhamento getAlinhamento() {
        return alinhamento;
    }

    public void setAlinhamento(Alinhamento alinhamento) {
        this.alinhamento = alinhamento;
    }
     
    @Override
    public String toString(){
        return getNome();
    }

    /**
     *
     * @return Converte um personagem para o tipo Object[]
     */
    public Object[] toObject() {
        Object[] objs = {this.getNome(), this.getDano(), this.getResistencia(), 
            this.getQuantidadeVida(), this.getAlinhamento(), this.getClasse(), this.getImagem()};
        
        return objs;
    }

    public Float getQuantidadeVidaMaxima() {
        return quantidadeVidaMaxima;
    }

    public void setQuantidadeVidaMaxima(Float quantidadeVidaMaxima) {
        this.quantidadeVidaMaxima = quantidadeVidaMaxima;
    }

    public Integer getQuantidadeVidaPercentual() {
        int totalPercentual = (int) ((this.getQuantidadeVida() * 100)/ this.getQuantidadeVidaMaxima());
        return totalPercentual;
    }
    
}

