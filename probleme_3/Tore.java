/**
 * Tore{}; classe  décrivant un Toroïde.
 *<br>
 *
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author J.BENKEMOUN, A.MOLAEI
 * @version 1.0
 */
public class Tore extends Point { // Hérite de Point.

    /**
     * ATTRIBUTS
     */
    protected double rayon;
    protected double Rayon2;

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Tore(){
        // Appel implicite au constructeur de la superclasse.
        setRayons( 0, 0 );
    }

    /**
     * CONSTRUCTEUR NATUREL
     * @param R le rayon extérieur
     * @param r le rayon intérieur
     * @param a la première coorodnnée du centr e
     * @param b la deuxième coordonnée du centre
     */
    public Tore(double R, double r, int a, int b ) {
        super( a, b ); // Appelle le constructeur de la superclasse.
        setRayons( R, r );
    }

    /**
     * setRayons(); setteur des rayons de la toreoïde
     * @param R le rayon extérieur
     * @param r le rayon intérieur
     */
    public void setRayons(double R, double r )
        { rayon = ( r >= 0.0 ? r : 0.0 ); Rayon2 = ( R >= 0.0 ? R : 0.0 );}

    /**
     * getRayon(); getter du rayon extérieur
     * @return le rayon exterieur du tore
     */
    public double getRayon () { return Rayon2; }

    /**
     * getEpaisseur(); getter de l'épaisseur du tore
     * @return l'épaisseur du tore
     */
    public double getEpaisseur () { return rayon; }

    /**
     * aire(); fonction pour calculer l'aire du tore
     * @return l'aire du tore
     */
    public double aire()
        { return Math.PI * Math.PI * rayon * Rayon2 * 4;}

    /**
     * volume(); fonction pour calculer le volume du tore
     * @return l'aire du tore
     */
    public double volume()
        { return Math.PI * Math.PI * rayon * rayon * Rayon2 * 2;}

    /**
     * toString(); redéfinition de la fonction système
     * @return une chaine de caractère de forme "Centre = [x; y]; Rayon = R"I
     */
    public String toString() {
        return "Centre = " + super.toString() + "; Rayon = " + Rayon2 + "; epaisseur = " + rayon;
    }
}
 
