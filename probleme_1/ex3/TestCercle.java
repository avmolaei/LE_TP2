//import des libraireis
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * CLASSE TestCercle{}
 *<br>
 *
 * classe de test du cercle dans  le cadre de l'exercice 3
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
public class TestCercle {

    /**
     * main(); point d'entrée principal du programme
     * @param args les arguments de ligne de commande
     */
    public static void main( String args[] ) {
        Cercle c = new Cercle( 2.5, 37, 43 );
        DecimalFormat precision2 = new DecimalFormat( "0.00" );
        String sortie;
        
        sortie = "L'abscisse vaut " + c. getX() + "\nL'ordonnée vaut " + c.getY() + "\nLe rayon vaut " + c.getRayon();

        c.setRayon( 4.25 );
        c.setPoint( 2, 2 );
        sortie += "\n\nLa nouvelle position et le rayon de c valent\n" + c + "\nL'aire vaut " + precision2.format( c.aire() );
        
        JOptionPane.showMessageDialog( null, sortie, "Démontre la classe Cercle", JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}
