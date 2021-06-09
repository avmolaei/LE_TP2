//import de jswing pour la GUI
import javax.swing.JOptionPane;
/**
 * CLASSE Testpoint{}
 *<br>
 *
 * classe de test du point dans  le cadre de l'exercice 3
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
public class TestPoint {

    /**
     * main(); point d'entrée principal du programme
     * @param args les arguments de ligne de commande
     */
    public static void main( String args[]) {
        Point p = new Point( 72, 115 );
        String sortie;
        sortie = "L'abscisse vaut" + p.getX() + "\nL'ordonnée vaut " + p.getY();
        p.setPoint( 10, 10 );
    // Appel implicite à p.toString().
    sortie += "\n\nLa nouvelle position de p vaut" + p;
    
    JOptionPane.showMessageDialog( null, sortie, "Démontre la classe Point", JOptionPane.INFORMATION_MESSAGE );
    System.exit( 0 );
    }
}
