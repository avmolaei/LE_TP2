/**
 * Forme{}; classe abstraite mère décrivant une forme géométrique.
 *<br>
 *
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
public abstract class Forme{
    /**
     * aire(); définition du calcul d'aire de la forme
     * @return l'aire de la forme
     */
    public double aire(){
        return 0.0;
    }

    /**
     * volume(); définition du calcul de volume du solide
     * @return le volume d'un solide
     */
    public double volume(){
        return 0.0;
    }

    /**
     * getNom(); définition du getter du nom de la forme
     * @return Ø
     */
    public abstract String getNom();
}
