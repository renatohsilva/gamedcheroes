/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedcheroes.controle;

import gamedcheroes.Equipe;
import gamedcheroes.Jogador;
import java.util.ArrayList;
import personagens.base.Personagem;
import personagens.controle.PersonagemControle;
import utilitarios.Enumeraveis;

public class EquipeControle {

    /**
     *
     * @param listPersonagensEquipeHumano lista de personagens da equipe do jogador humano.
     * @return uma lista de personagens equivalente a equipe humana para a equipe do computador.
     */
    public Equipe GeraEquipeMaquinaEquivalente(ArrayList<Personagem> listPersonagensEquipeHumano) {
        Jogador jogadorMaquina = new Jogador("Computador", Enumeraveis.TipoJogador.Computador);
        ArrayList<Personagem> personagensEquipeMaquina = new ArrayList<Personagem>();
        PersonagemControle personagemControle = new PersonagemControle();

        listPersonagensEquipeHumano.stream().forEach((personagemEquipeHumano) -> {
            personagensEquipeMaquina.add(personagemControle.getPersonagemEquivalente(personagemEquipeHumano.getAlinhamento(), personagemEquipeHumano.getClasse()));
        });

        Equipe equipeMaquina = new Equipe(jogadorMaquina, personagensEquipeMaquina);
        return equipeMaquina;
    }

}
