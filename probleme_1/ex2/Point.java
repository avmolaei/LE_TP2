/**
 * CLASSE Point{}
 *<br>
 *
 * Description du Point dansle cadre de l'exercice 1 (Abstraite)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author I.ALAME
 * @version 1.0
 */
public class Point extends Object {

    /**
     * ATTRIBUTS
     */
    protected int x, y; // Coordonnées du Point.

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Point() {
        x = 0;
        y = 0;
        System.out.println( "Constructeur de Point: " + this );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param a la première coordonnée
     * @param b la deuxième coordonnée
     */
    public Point( int a, int b) {
        x = a;
        y = b;
        System.out.println( "Constructeur de Point: " + this );
    }

    /**
     * finalize(); finaliseur du Point (l'affiche  dans la console
     */
    protected void finalize() {
        System.out.println( "Finaliseur de Point: " + this );
    }

    /**
     * toString(); surcharge de la fonction toString() système
     * @return une représentation en chaine de caractère de forme "[x, y]"
     */
    @Override
    public String toString() { 
        return "["+x + ", " + y + "]";
    }
}
