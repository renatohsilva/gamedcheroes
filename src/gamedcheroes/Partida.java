/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedcheroes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import personagens.base.Personagem;
import utilitarios.Enumeraveis.*;

public class Partida {

    private Equipe equipeJogador;
    private Equipe equipeComputador;

    public Partida(Equipe equipeHumana, Equipe equipeMaquina) {
        equipeJogador = equipeHumana;
        equipeComputador = equipeMaquina;
    }

    public Equipe getEquipeJogador() {
        return equipeJogador;
    }

    public void setEquipeJogador(Equipe equipeJogador) {
        this.equipeJogador = equipeJogador;
    }

    public Equipe getEquipeComputador() {
        return equipeComputador;
    }

    public void setEquipeComputador(Equipe equipeComputador) {
        this.equipeComputador = equipeComputador;
    }

    /**
     *
     * @return Retorna qual é o jogador que esta na vez de jogar.
     */
    public TipoJogador getTipoJogadorDaVez() {
        Jogador jogador;
        if (getEquipeJogador().getJogador().getJogando()) {
            jogador = getEquipeJogador().getJogador();
        } else {
            jogador = getEquipeComputador().getJogador();
        }
        return jogador.getTipo();
    }

    /**
     *
     * @param tipoJogador Variavel que representa qual é o tipo de jogador que 
     * esta jogando.
     * Seta o booleano jogando de qual equipe esta na vez de jogar.
     */ 
    public void getQuemIniciaJogo(TipoJogador tipoJogador) {
        if (TipoJogador.Humano.equals(tipoJogador)) {
            equipeJogador.getJogador().setJogando(true);
            equipeComputador.getJogador().setJogando(false);
        } else {
            equipeJogador.getJogador().setJogando(false);
            equipeComputador.getJogador().setJogando(true);
        }
    }

    /**
     *Seta o booleano jogando de qual equipe é a proxima a jogar.
     */
    public void getProximoAJogar() {
        if (getTipoJogadorDaVez().equals(TipoJogador.Humano)) {
            equipeJogador.getJogador().setJogando(false);
            equipeComputador.getJogador().setJogando(true);
        } else {
            equipeJogador.getJogador().setJogando(true);
            equipeComputador.getJogador().setJogando(false);
        }
    }
    
    /**
     *
     * @return true se a partida acabou, uma das equipes não tem mais personagens,
     *  false caso contrario.
     */
    public Boolean fimDaPartida(){       
        return ((getEquipeJogador().getPersonagens().isEmpty()) ||
                (getEquipeComputador().getPersonagens().isEmpty()));
    }
    
    /**
     *
     * @return Retorna quem é o jogador ganhador, jogador da equipe que tem como 
     * adversario uma equipe que perdeu todos os seus personagens
     */
    public Jogador getJogadorGanhador(){
        if(getEquipeJogador().getPersonagens().isEmpty()){
            return getEquipeComputador().getJogador();
        }
        if(getEquipeComputador().getPersonagens().isEmpty()){
            return getEquipeJogador().getJogador();
        }
        return null;
    }
    
    /**
     *
     * @param personagem Personagem que sofre o ataque
     * @param lstPersonagens lista de personagens a qual o personagem passado 
     * por parametro esta inserido.
     * @param saida string referente a o que aconteceu com o personagem, se ele 
     * morreu ou não.
     * @return true se o personagem morreu e foi retirado da lista, false caso 
     * contrario.
     */
    public boolean verificaPersonagemMorto(Personagem personagem, ArrayList<Personagem> lstPersonagens, String saida) {
        boolean bRetorno = false;
        if (personagem.getQuantidadeVida() == 0) {
            lstPersonagens.remove(personagem);
            bRetorno = true;
            saida += "O personagem "+ personagem.getNome() + " morreu";          
        }
        return bRetorno;
    }
    
    /**
     * 
     * @param log log do jogo.
     * @param endereco endereço de gravação do arquivo.
     * 
     * Grava o log do jogo no caminho especificado por endereco
     */
    public void gravarArquivo(String log, String endereco){
        try{
            Date dt = new Date();
            FileWriter writer; 
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 
                       
            String endPasta  = endereco + "/Logs/";
            String endArquivo = "logJogoDCHeroes_"+(sdf.format(dt).replace("/", "-").replace(" ", "_").replace(":", "_")) +".txt";
            File f = new File(endPasta);
            if (f.exists() && f.isDirectory()) {
               writer = new FileWriter(new File(endPasta+endArquivo));        
               try (PrintWriter saida = new PrintWriter(writer)) {
                   saida.print(log);
               }    
               writer.flush(); 
               writer.close();      
            } else {
               f.mkdir();
               writer = new FileWriter(new File(endPasta+endArquivo));        
               try (PrintWriter saida = new PrintWriter(writer)) {
                   saida.print(log);
               }    
               writer.flush(); 
               writer.close(); 
            }   
        } catch (IOException e){
        }
    }

}
