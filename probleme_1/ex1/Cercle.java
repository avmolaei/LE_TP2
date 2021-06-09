/**
 * CLASSE Cercle {}
 *<br>
 *
     * Description du Cercle dans le cadre de l'exercice 1
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
public class Cercle extends Point { // Herite de Point.

    /**
     * ATTRIBUTS
     */
    protected double rayon; // Constructeur sans argument.

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Cercle() { // ftpel implicitt au constructeur de la superclasse.
        setRayon(0); 
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param r la valeur du rayon
     * @param a la première coordonnée du centre
     * @param b la deuxième coordonnée du centre
     */
    public Cercle(double r, int a, int b) { 
        super( a, b ); // Appel au constructeur de la classe mère.
        setRayon( r ); 
        }

    /**
     * setRayon(); setteur du rayon
     * @param r valeur du rayon
     */
    public void setRayon( double r ) { 
        rayon = ( r >= 0.0 ? r : 0.0 ); 
    }

    /**
     * getRayon(); accesseur de Rayon
     * @return la valeur du rayon
     */
    public double getRayon() { 
        return rayon; 
    }

    /**
     * aire(); calcul de l'aire
     * @return l'aire du cercle
     */
    public double aire() {
        return Math.PI * rayon * rayon; 
    }

    /**
     * toString(); surcharge de la fonction toString() système
     * @return une représentation en chaine de caractère de forme "[x, y]"
     */
    @Override
    public String toString() {
        return "Centre = " + "[" + x + ", " + y + "]" + "; Rayon = " + rayon; 
    }   
}  
