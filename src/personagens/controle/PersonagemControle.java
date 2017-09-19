/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens.controle;

import personagens.protagonistas.*;
import personagens.antagonistas.*;
import java.util.ArrayList;
import personagens.base.*;
import java.util.Comparator;
import java.util.Random;
import utilitarios.Enumeraveis;

public class PersonagemControle {

    /**
     *
     * @return Retorna uma lista com todos os personagens
     */
    public ArrayList<Personagem> getTodosPersonagens() {
        ArrayList<Personagem> listPersonagens = new ArrayList<Personagem>();

        listPersonagens.add(new AdaoNegro());
        listPersonagens.add(new Ajax());
        listPersonagens.add(new Apocalypse());
        listPersonagens.add(new Aquaman());
        listPersonagens.add(new Ares());
        listPersonagens.add(new Arlequina());
        listPersonagens.add(new ArqueiroVerde());
        listPersonagens.add(new AsaNoturna());
        listPersonagens.add(new Bane());
        listPersonagens.add(new Batman());
        listPersonagens.add(new Coringa());
        listPersonagens.add(new Cyborg());
        listPersonagens.add(new Darkseid());
        listPersonagens.add(new Exterminador());
        listPersonagens.add(new Flash());
        listPersonagens.add(new LanternaVerde());
        listPersonagens.add(new LexLuthor());
        listPersonagens.add(new MulherGato());
        listPersonagens.add(new MulherGaviao());
        listPersonagens.add(new MulherMaravilha());
        listPersonagens.add(new Nevasca());
        listPersonagens.add(new Ravena());
        listPersonagens.add(new Shazam());
        listPersonagens.add(new Sinestro());
        listPersonagens.add(new SolomonGrundy());
        listPersonagens.add(new SuperHomem());
        listPersonagens.add(new Zatanna());
        listPersonagens.add(new Zod());

        return this.ordenaListaPersonagens(listPersonagens);
    }

    /**
     *
     * @param alinhamento sera utilizado para geração da lista final da função
     * @return Retorna uma lista com todos os personagens de um determinado alinhamento
     */
    public ArrayList<Personagem> getPersonagensPorAlinhamento(Enumeraveis.Alinhamento alinhamento) {
        ArrayList<Personagem> listTodosPersonagens = new ArrayList<Personagem>();
        ArrayList<Personagem> listPersonagens = new ArrayList<Personagem>();
        
        listTodosPersonagens.addAll(getTodosPersonagens());
        listTodosPersonagens.stream().filter((personagem) -> (personagem.getAlinhamento().equals(alinhamento))).forEach((personagem) -> {
            listPersonagens.add(personagem);
        });

        return ordenaListaPersonagens(listPersonagens);
    }

    /**
     *
     * @param alinhamento  sera utilizado para geração da lista final da função
     * @param classe  sera utilizado para geração da lista final da função
     * @return Retorna uma lista com todos os personagens de um determinado alinhamento e classe
     */
    public ArrayList<Personagem> getPersonagensPorAlinhamentoEClasse(Enumeraveis.Alinhamento alinhamento, Enumeraveis.Classe classe) {
        ArrayList<Personagem> listPersonagens = new ArrayList<Personagem>();

        ArrayList<Personagem> listPersonagensAlinhamento = new ArrayList<Personagem>();
        listPersonagensAlinhamento.addAll(getPersonagensPorAlinhamento(alinhamento));
        for (Personagem personagem : listPersonagensAlinhamento) {
            if (personagem.getClasse().equals(classe)) {
                listPersonagens.add(personagem);
            }
        }

        return ordenaListaPersonagens(listPersonagens);
    }

    /**
     *
     * @param alinhamento  sera utilizado para geração da do personagem randomico
     * @param classe  sera utilizado para geração da do personagem randomico
     * @return Retorna um unico personagem randomico que se encaixe no alinhamento e na classe
     */
    public Personagem getPersonagemEquivalente(Enumeraveis.Alinhamento alinhamento, Enumeraveis.Classe classe) {
        ArrayList<Personagem> listPersonagensEquivalentes = new ArrayList<Personagem>();
        listPersonagensEquivalentes.addAll(getPersonagensPorAlinhamentoEClasse(alinhamento, classe));
        Random numRandom = new Random();
        Personagem personagemEquivalente = listPersonagensEquivalentes.get(numRandom.nextInt(listPersonagensEquivalentes.size()));

        return personagemEquivalente;
    }
    
    /**
     *
     * @param listaPersonagensDesordenada lista de personagens a ser ordenada.
     * @return Ordena a lista de personagem passada por parametro
     */
    public ArrayList<Personagem> ordenaListaPersonagens(ArrayList<Personagem> listaPersonagensDesordenada) {
        listaPersonagensDesordenada.sort((Personagem p1, Personagem p2) -> p1.getNome().compareTo(p2.getNome()));
        return listaPersonagensDesordenada;
    }
}
