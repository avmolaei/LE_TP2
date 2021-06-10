/**
 * sPHERE{}; classe  décrivant une sphère.
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
public class Sphere extends Point { // Hérite de Point.

    /**
     * ATTRIBUTS
     */
    protected double rayon;

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Sphere(){
        // Appel implicite au constructeur de la superclasse.
        setRayon( 0 );
    }

    /**
     * CONSTRUCTEUR NATUREL
     */
    public Sphere( double r, int a, int b ) {
        super( a, b ); // Appelle le constructeur de la superclasse.
        setRayon( r );
    }

    /**
     * setRayon(); setteur du rayon de la sphère
     * @param r le rayon
     */
    public void setRayon( double r )
        { rayon = ( r >= 0.0 ? r : 0.0 ); }

    /**
     * getRayon(); getter du rayon de la sphère
     * @return la valeur du rayon
     */
    public double getRayon () { return rayon; }

    /**
     * aire(); fonction pour calculer l'aire de la sphère
     * @return l'aire de la sphère
     */
    public double aire()
        { return Math.PI * rayon * rayon * 4;}

    /**
     * volume(); fonction pour calculer le volume de la sphère
     * @return l'aire de la sphère
     */
    public double volume()
        { return Math.PI * rayon * rayon * rayon * 4/3;}

    /**
     * toString(); redéfinition de la fonction système
     * @return une chaine de caractère de forme "Centre = [x; y]; Rayon = R"I
     */
    public String toString() {
        return "Centre = " + super.toString() + "; Rayon = " + rayon;
    }
}
 
