/**
 * CLASSE Cylindre{}
 *<br>
 *
 * Description du Cylindre dans le cadre de l'exercice 3
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
public class Cylindre extends Cercle {
    protected double hauteur; // Hauteur du Cylindre.

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Cylindre() {
        // Appel implicite au constructeur de la superclasse.
        setHauteur( 0 );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param h hauteur
     * @param r rayon
     * @param a première coordonnée du centre
     * @param b deuxième coordonnée du centre
     **/
    public Cylindre( double h, double r, int a, int b ) {
        super( r, a, b );
        setHauteur( h );
    }

    /**
     * setHauteur(); setteur de la hauteur h
     * @param h la hauteur à modifier
     */
    public void setHauteur( double h )
        { hauteur = ( h >= 0 ? h : 0 ); }

    /**
    // Ajuste la hauteur du Cylindre.b deuxième coordonnée du centre

     * getHauteur(); accesseur d ehauteur
     * @return la valeur de la hauteur
     */
    public double getHauteur () { return hauteur; }

    /**
     * aire(); calcul de l'aire (calcule l'air du cercle avec super et y ajoute la surface latérale)
     * @return la valeur de l'aire
     */
    public double aire() {
        return 2 * super.aire() + 2 * Math.PI * rayon * hauteur;
    }


    /**
     * volume(); calucl du volume du cylindre
     * @return la valeur du cylindre
     */
    public double volume() { return super.aire() * hauteur; }



    /**
     * toString(); redéfinition de la fonction système toString()
     * @return le cercle sous forme de chaine de caractère de forme "Centre = [X; Y]; Rayon = R"
     */
    public String toString() {
        return super.toString() + "; Hauteur = " + hauteur;
    }
}
