/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

import java.util.ArrayList;

/**
 *
 * Author     : wardb
 * naam       : Ward Beyens
 * studentNr  : r0703044
 */

public class Pretpark {

    private String naam;
    private int aantalBezoekers;
    private ArrayList<Attractie> attracties = new ArrayList<>();

    public Pretpark(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ArrayList<Attractie> getAttracties() {
        return attracties;
    }

    public int getAantalAttracties() {
        return attracties.size();
    }

    public void voegAttractieToe(Attractie attractie) {
        attracties.add(attractie);
    }

    public Attractie zoekAttractieOpNaam(String naam) {
        if (attracties.isEmpty()) {
            return null;
        } else {
            for (Attractie attractieNaamInLijst : attracties) {
                if (attractieNaamInLijst.getNaam().equals(naam)) {
                    return attractieNaamInLijst;
                } // sluit if
            } // sluit for
            return null;
        }
    }

    public void registreerBezoeker(Bezoeker bezoeker) {
        aantalBezoekers += 1;
        bezoeker.setPretparkcode(aantalBezoekers);
    }

}
