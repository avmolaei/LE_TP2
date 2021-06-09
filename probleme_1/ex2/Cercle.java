/**
 * CLASSE Cercle{}
 *<br>
 *
 * Description du Cercle dans le cadre de l'exercice 2
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
public class Cercle extends Point { // Hérite de Point.
    /**
     * ATTRIBUTS
     */
    protected double rayon;

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Cercle(){
        // Appel implicite au constructeur de la superclasse.
        rayon = 0;
        System.out.println( "Constructeur de Cercle: " + this );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param r le rayon du cercle
     * @param a la première coordonnée du centre
     * @param b la deuxième coordonneé du centre
     */
    public Cercle( double r, int a, int b ){
        super( a, b ); // Appelle le constructeur de la superclasse.
        rayon = r;
        System.out.println( "Constructeur de Cercle: " + this );
    }

    /**
     * finalize(); finaliseur du cercle (l'affiche dans la console)
     */
    protected void finalize() {
        System.out.println( "Finaliseur de Cercle: " + this );
        super.finalize(); // Appelle le finaliseur de la superclesse.
    }

    /**
     * toString(); surcharge de la fonction toString() système
     * @return une représentation en chaine de caractère de forme "[x, y]"
     */
    @Override
    public String toString() {
        return "Centre = " + super.toString() + "; Rayon = " + rayon;
    }
}
