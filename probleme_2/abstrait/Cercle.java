/**
 * Cercle{}; classe  décrivant un cercle.
 *<br>
 *
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author I.ALAME, J.BENKEMOUN, A.MOLAEI
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
    setRayon( 0 );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param r le rayon
     * @param a la première coorodnnée du centr e
     * @param b la deuxième coordonnée du centre
     */
    public Cercle( double r, int a, int b ) {
    super( a, b ); // Appelle le constructeur de la superclasse.
    setRayon( r );
    }

    /**
     * setRayon(); setteur du rayon du cercle
     * @param r le rayon
     */
    public void setRayon( double r )
        { rayon = ( r >= 0.0 ? r : 0.0 ); }

    /**
     * getRayon(); getter du rayon du cercle
     * @return la valeur du rayon
     */
    public double getRayon () { return rayon; }

    /**
     * aire(); fonction pour calculer l'aire du cercle
     * @return l'aire du cercle
     */
    public double aire()
        { return Math.PI * rayon * rayon;}

    /**
     * toString(); redéfinition de la fonction système
     * @return une chaine de caractère de forme "Centre = [x; y]; Rayon = R"I
     */
    public String toString() {
        return "Cercle: \n" + "Centre = " + super.toString() + "; Rayon = " + rayon;
    }
}
