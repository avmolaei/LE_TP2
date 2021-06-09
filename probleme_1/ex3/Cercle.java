/**
 * CLASSE Cercle{}
 *<br>
 *
 * Description du Cercle dans le cadre de l'exercice 3
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author I.ALAME
 * @version 1.0
 *//**
 * CLASSE Cercle{}
 *<br>
 *
 * Description du Cercle dans le cadre de l'exercice 3
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
    protected double rayon;


    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Cercle(){
    // Appel implicite au constructeur de la superclasse.
    setRayon( 0 );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param r Le rayon du cercle
     * @param a la première coordonnée du centre
     * @param b la deuxième coorodnnée du centre
     */
    public Cercle( double r, int a, int b ) {
    super( a, b ); // Appelle le constructeur de la superclasse.
    setRayon( r );
    }

    /**
     * setRayon(); setteur du rayon
     * @param r la valeur du rayon
     */
    public void setRayon( double r )
        { rayon = ( r >= 0.0 ? r : 0.0 ); }

    /**
     * getRayon(); accesseur du rayon
     * @return la valeur du rayon (double)
     */
    public double getRayon () { return rayon; }

    /**
     * aire(); calcule l'aire du cercle
     * @return la valeur de l'aire du cercle
     */
    public double aire()
        { return Math.PI * rayon * rayon;}

    /**
     * toString(); redéfinition de la fonction système toString()
     * @return le cercle sous forme de chaine de caractère de forme "Centre = [X; Y]; Rayon = R"
     */
    public String toString() {
        return "Centre = " + super.toString() + "; Rayon = " + rayon;
    }
}
