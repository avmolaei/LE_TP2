// Application testant la classe Point.
import javax.swing.JOptionPane;

/**
 * Point{}; classe  décrivant un point.
 *<br>
 *
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author I.ALAME, J.BENKEMOUN, A.MOLAEI
 * @version 1.0
 */
public class Test {

    /**
     * main(); point d'entrée principal du programme
     * @param args les arguments de ligne de commande
     */
    public static void main( String args[]) {
        Point p = new Point( 72, 115 );
        Sphere s = new Sphere(6, 72, 115);
        Tore t = new Tore(10, 6, 72, 115);
        String sortie;
        sortie = "Point: " + p + "\n" + format(p) + "\n";
        sortie += "Sphère: " + s + "\n" + format(s) + "\n";
        sortie += "Tore: " + t + "\n" + format(t) + "\n";
    // Appel implicite à p.toString().
    
    JOptionPane.showMessageDialog( null, sortie, "Polymorphisme", JOptionPane.INFORMATION_MESSAGE );
    System.exit( 0 );
    }

    public static String format(Point f){
        return "Aire = " + f.aire() + "\nVolume = " + f.volume() + "\n";
    }
}
 
