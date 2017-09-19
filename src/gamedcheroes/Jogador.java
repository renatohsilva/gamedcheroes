/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedcheroes;
import utilitarios.Enumeraveis.*;

public class Jogador {
    private String nome;
    private TipoJogador tipo; 
    private Boolean jogando;
    
    public Jogador(){
        
    }
    
    public Jogador(String nome, TipoJogador tipo){
        this.nome = nome;
        this.tipo = tipo;
    }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoJogador getTipo() {
        return tipo;
    }

    public void setTipo(TipoJogador tipo) {
        this.tipo = tipo;
    }

    public Boolean getJogando() {
        return jogando;
    }

    public void setJogando(Boolean jogando) {
        this.jogando = jogando;
    }
       
}
