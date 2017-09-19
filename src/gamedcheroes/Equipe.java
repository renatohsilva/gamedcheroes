/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedcheroes;
import java.util.ArrayList;
import java.util.Random;
import personagens.base.*;
import utilitarios.Dificuldade;

public class Equipe {

    private Jogador jogador;
    private ArrayList<Personagem> personagens;
    
    public Equipe(Jogador jogador, ArrayList<Personagem> personagens){
        this.jogador = jogador;
        this.personagens = personagens;
    }
    
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(ArrayList<Personagem> personagens) {
        this.personagens = personagens;
    }
    
    /**
     *
     * @return um personagem randomico
     */
    public Personagem getPersonagemRandom(){
        Random random = new Random();
        Personagem personagemRandom = personagens.get(random.nextInt(personagens.size()));
        return personagemRandom;
    }
    
    /**
     *
     * @param dificuldade enumeravel referente a dificuldade
     * Altera a quantidade de vida e a quantidade de vida maxima de cada personagem
     * do computador, de acordo com a dificuldade escolhida pelo jogador
     */
    public void implementaDificuldade(Dificuldade dificuldade){
        this.personagens.stream().map((personagem) -> {
            personagem.setQuantidadeVida(personagem.getQuantidadeVida() * dificuldade.getMultiplicador(dificuldade));
            return personagem;
        }).forEach((personagem) -> {
            personagem.setQuantidadeVidaMaxima(personagem.getQuantidadeVida());
        });
    }
}


