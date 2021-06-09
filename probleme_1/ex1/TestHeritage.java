//import des librairies nécessaires
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * CLASSE TestHeritage{}
 *<br>
 *
 * Classe de test de l'exercice 1
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author Jules Benkemoun,  Avesta MOLAEI
 * @version 1.0
 */
public class TestHeritage { // Démontre la relation “est un".

    /**
     * main(); point d'entrée principal du programme
     * @param args les arguments de ligne de commande
     */
    public static void main( String args[] ){
        /**
         * ATTRIBUTS
         */
        Point pointRef, p;
        Cercle cercleRef, c;
        String sortie;

        p = new Point(30, 50);
        c = new Cercle( 2.7, 120, 89 );

        sortie = "Point p: " + p.toString() + "\nCercle c:" + c.toString();
        pointRef = c; // Assigne le Cercle & pointRef.
        sortie += "\n\nCercle c (via pointRef): " + pointRef.toString();


        // Remplace le type de la référence @ la superclasse
        // contenue par pointRef ver    s une référence a la
        // sous-classe cercleRef.
        cercleRef = (Cercle) pointRef;
        sortie += "\n\nCercle c (via cercleRef): " + cercleRef.toString();
        DecimalFormat precision2 = new DecimalFormat( "0.00" );
        sortie += "\n\nAire de c (via cercleRef): " + precision2.format(cercleRef.aire());
        //référence a Cercle.

        if (p instanceof Cercle ) {
            cercleRef = (Cercle) p; // ligne 41 de TestHeritage.java.
            sortie += "\n\nremplacement de type réussi";
        }
        else
            sortie += "\n\np ne référence pas un Cercle";
        JOptionPane.showMessageDialog( null, sortie, "Démontre la relation \"est un\"", JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
        }
}
