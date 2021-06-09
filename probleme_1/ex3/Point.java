/**
 * CLASSE Point{}
 *<br>
 *
 * Description du Point  dans le cadre de l'exercice 3
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
public class Point {

    /**
     * ATTRIBUTS
     */
    protected int x, y; // Coordonnées du point.

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Point() { setPoint( 0, 0 ); }

    /**
     * CONSTRUCTEUR NATUREL
     * @param a la première coordonnée du point
     * @param b la deuxième coordonnée du point
     */
    public Point( int a, int b ){ setPoint( a, b ); }

    /**
     * setPoint(); setteur de point
     * @param a la première coordonnée
     * @param b la deuxième coordonnée
     */
    public void setPoint( int a, int b ) {
        x = a;
        y = b;
    }

    /**
     * getX(); getteur de la première coordonnée, l'abscisse
     * @return la valeur de la première coordonnée x
     */
    public int getX() { return x; }

    /**
     * getY(); getteur de la deuxième coordonnée, l'ordonnée
     * @return la valeur de la deuxième coordonnée y
     */
    public int getY() { return y; }

    /**
     * toString(); redéfinition de la fonction système toString()
     * @return le cercle sous forme de chaine de caractère de forme "Centre = [X; Y]; Rayon = R"
     */
    public String toString(){
        return "[" + x + ", " + y + "]"; 
    }
}
