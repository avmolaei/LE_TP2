/**
 * Cylindre{}; classe  décrivant un cylindre.
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
public class Cylindre extends Cercle {
    /**
     * ATTRIBUTS
     */
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
     * @param h la hauteur
     * @param r le rayon
     * @param a la première coordonnée du centre
     * @param b la deuxième coordonnée du centre
     */
    public Cylindre( double h, double r, int a, int b ) {
        super( r, a, b );
        setHauteur( h );
    }

    /**
     * CONSTRUCTEUR PAR DEFAUT
     * @param h la hauteur
     */
    public void setHauteur( double h ) { hauteur = ( h >= 0 ? h : 0 ); }

    /**
     * getHauteur(); getter de la hauteur du cylindre
     * @return la hauteur du cylindre
     */
    public double getHauteur () { return hauteur; }

    /**
     * aire(); calcul de l'air du cylindre
     * @return la valeur de l'air
     */
    public double aire() {
        return 2 * super.aire() + 2 * Math.PI * rayon * hauteur;
    }

    /**
     * volume(); calcul du volume du cylindre
     * @return la valeur du volume
     */
    public double volume() { return super.aire() * hauteur; }

    /**
     * toString(); redéfinitionde la fonction toString système
     * @return une représentation du cylindre de forme "Centre = [x; y]; Rayon = R; Hauteur = H"
     */
    public String toString() {
        return "Cylindre: \n" + super.toString() + "; Hauteur = " + hauteur;
    }
}