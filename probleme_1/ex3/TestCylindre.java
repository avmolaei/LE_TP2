//import des librairies
import javax. swing. JOptionPane;
import java.text.DecimalFormat;

/**
 * CLASSE TestCylindre{}
 *<br>
 *
 * classe de test du cylindre dans  le cadre de l'exercice 3
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
public class TestCylindre {

    /**
     * main(); point d'entrée principal du programme
     * @param args les arguments de ligne de commande
     */
    public static void main( String args[] ) {
        Cylindre c = new Cylindre( 5.7, 2.5, 12, 23 );
        DecimalFormat precision2 = new DecimalFormat( "0.00" );
        String sortie;
        sortie = "L'abscisse vaut " + c.getX() + "\nL'ordonnée vaut " + c.getY() + "\nLe rayon vaut " + c.getRayon () + "\nLa hauteur vaut " + c.getHauteur();
        c.setHauteur( 10 );
        c.setRayon( 4.25 );
        c.setPoint( 2, 2 );
        sortie += "\n\nLa nouvelle position, rayon " + "et hauteur de c valent\n" + c + "\nL'aire vaut " + precision2.format( c.aire()) + "\nLe volume vaut " + precision2.format( c.volume () );

        JOptionPane.showMessageDialog( null, sortie, "Démontre la classe Cylindre", JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }      
}
