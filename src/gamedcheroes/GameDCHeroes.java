/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedcheroes;

import telas.*;

public class GameDCHeroes {   
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // Tempo da SplashScreen do Jogo 
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        
        
        //Constrói a TelaNomeJogador
        TelaNomeJogador telaNomeJogador = new TelaNomeJogador();
        telaNomeJogador.setLocationRelativeTo(null);
        telaNomeJogador.setVisible(true);
    }
}
