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

public class Bezoeker extends Persoon {

    private ArrayList<String> wishlist = new ArrayList<>();
    private int pretparkcode;

    public Bezoeker(String voornaam, String familienaam) {
        super(voornaam, familienaam);
        this.pretparkcode = -1;
    }

    public int getPretparkcode() {
        return pretparkcode;
    }

    public void setPretparkcode(int pretparkcode) {
        this.pretparkcode = pretparkcode;
    }

    public ArrayList<String> getWishlist() {
        return wishlist;
    }

    public boolean voegToeAanWishlist(String attractienaam) {
        int size = wishlist.size();
        if (size < 5) {
            wishlist.add(attractienaam);
            return true;
        } else {
            return false;
        }
    }

    public int getAantalOpWishlist() {
        return wishlist.size();
    }

    @Override
    public String toString() {
        return ("Bezoeker " + super.toString() + " met pretparkcode " + pretparkcode);
    }

}
