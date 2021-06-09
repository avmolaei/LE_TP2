/**
 * CLASSE Test{}
 *<br>
 *
 * Classe de Test de l'exercice 2
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
class Test {

    /**
     * main(); point d'entrée principal du programme
     * @param args
     */
    public static void main( String args[] ) {
        Cercle cerclel, cercle2;
        cerclel = new Cercle( 4.5, 72, 29 );
        cercle2 = new Cercle( 10, 5, 5 );
        cerclel = null; // Marque pour le ramasse miettes.
        cercle2 = null; // Marque pour le ramasse miettes.
        System.gc(); // Appelle au ramasse miettes.
    }
}
