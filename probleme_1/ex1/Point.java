/**
 * CLASSE Point{}
 *<br>
 *
 * Description du Point dans le cadre de l'exercice 1
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
    protected int x, y; // Coordonnées du Point.

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Point(){
        // Appel implicite au constructeur de la classesuperclasse mère.
            setPoint(0,0);
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param a la première coordonnée
     * @param b la deuxième coordonnée
     */
    public Point(int a, int b){
        // Appel implicite au constructeur de la classe mère.
        setPoint(a, b);
    }

    /**
     * setPoint(); setteur de a & b
     * @param a la valeur de x à modifier
     * @param b la valeur de y à modifier
     */
    public void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    /**
     * getX(); accesseur de x
     * @return x la valeur de x
     */
    public int getX() { return x; }

    /**
     * getY(); accesseur de y
     * @return la valeur de y
     */
    public int getY() { return y; }

    /**
     * toString(); surcharge de la fonction toString() système
     * @return une représentation en chaine de caractère de forme "[x, y]"
     */
    @Override
    public String toString(){
        return "[" + x + ", " + y + "]"; 
    }
}
