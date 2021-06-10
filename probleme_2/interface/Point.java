// Définition de la classe Point.
public class Point implements Forme {
    /**
     * ATTRIBUTS
     */
    protected int x, y;

    /**
     * CONSTRUCTEUR PAR DEFAUT
     */
    public Point() { setPoint( 0, 0 ); }

    /**
     * CONSTRUCTEUR NATUREL
     * @param a la première coorodnnée du point
     * @param b la deuxième coordonnée du point
     */
    public Point( int a, int b ){ setPoint( a, b ); }

    /**
     * setPoint(); setteur des 2 coordonnées du point
     * @param a la première coordonnée
     * @param b la deuxième coordonnée
     */
    public void setPoint( int a, int b ) {
        x = a;
        y = b;
    }

    /**
     * getX(); accesseur de la première coordonnée; l'abscisse
     * @return la première coordonnée x
     */
    public int getX() { return x; }

    /**
     * getY(); accesseur de la deuxième  coordonnée; l'ordonnée
     * @return la deuxième coordonnée y
     */
    public int getY() { return y; }

    /**
     * toString(); redéfinition de la fonction system
     * @return le point en forme de caractère de format "[x, y]
     */
    public String toString(){
        return "Point: \n[" + x + ", " + y + "]";
    }

    /**
     * getNom(); accesseur du pointB
     * @return
     */
    public String getNom(){
        return this.toString();
    }

    /**
     * aire(); renvoie 0 si l'utilisateur calcule l'aire d'un point
     * @return 0
     */
    public double aire() {return 0.0;}

    /**
     * volume(); renvoie 0 si l'utilisateur calcule le volume d'un point
     * @return 0
     */
    public double volume() {return 0.0;}
}
