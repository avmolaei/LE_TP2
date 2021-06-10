//import de jswing pour la gui
import javax.swing.JOptionPane;

    /**
     * Test{}; classe  de test des formes
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
    public class Test {

        /**
         * main(); point d'entrée principal du programme
         *
         * @param args les arguments de ligne de commande
         */
        public static void main( String args[]) {
            Forme p = new Point( 72, 115 );
            Forme c = new Cercle(6, 72, 115);
            Forme cyl = new Cylindre(5, 6, 72, 115);
            String sortie = " ";
            Forme[] tab = new Forme[3];
            tab[0] = p;
            tab[1] = c;
            tab[2] = cyl;

            for(Forme f: tab){
                sortie += f.toString();
                sortie += format(f);
                sortie += "\n\n";
            }

            JOptionPane.showMessageDialog( null, sortie, "Polymorphisme", JOptionPane.INFORMATION_MESSAGE );
            System.exit( 0 );
        }

        /**
         * format(); mise en forme de l'aire et du volume de la forme
         * @param f la forme
         * @return une chaine de caractère de forme "Aire = A et Volume = V"
         */
        public static String format(Forme f){
        return "Aire = " + f.aire() + "\nVolume = " + f.volume() + "\n";
    }
}
