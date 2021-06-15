//import de jswing et awt pour la gui
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * Convertisseur{}; classe "moteur" principale de l'application<br>
 *
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation either version 3 of the License, or
 * (at your option) any later version.
 * <br>
 *
 * @author J.BENKEMOUN, A.MOLAEI
 * @version 1.0
 */
public class Convertisseur extends JFrame{

    /**
     * ATTRIBUTS
     */
    public double dtx;

    /**
     * main(); point d'entrée principal du programme
     * @param args l'argument de ligne de commande
     */
    public static void main(String[] args){
        Convertisseur c = new Convertisseur();
        c.draw();
    }

    /**
     * primitiveConvert(); convertit le chiffre entré en dollars selon un taux
     * @param eur le taux de change
     * @return la valeur en dollars après la conversion
     */
    public double primitiveConvert(double eur){
        return (dtx*eur*100.0)/100.0;
    
    }


    /**
     * getDialogValue(); récupère la valuer rentrée dans la config dialog
     * @return la valeur entrée
     */
    public double getDialogValue(MenuCOnvertisseru mc){
        if(mc.dc.valid) return Double.parseDouble(mc.dc.in.getText());
        return dtx;
    }

    /**
     * draw(); coeur de la génération de la fenetre de l'application
     */
    public void draw(){
        //INITIALISATION
        ImageIcon icon = new ImageIcon("icon.png"); //on ajoute une petite icone, qui ne s'affiche que si l'application est exécutée sur windows.
        dtx = 1.35;
        MenuConvertisseur mc = new MenuConvertisseur();
        JFrame f = new JFrame("Convertisseur EUR/USD");
        JPanel pan = new JPanel();
        f.setIconImage(icon.getImage());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setSize(300, 200);
        JLabel euro = new JLabel("Euro");
        JTextField input = new JTextField(6);
        JButton b = new JButton("Convertir");
        JLabel dollar = new JLabel("Dollar");
        JTextField output = new JTextField(6);
        ogetDialoggetDialogutput.setEditable(false);
        JLabel tx = new JLabel("taux de conversion: 1euro = " + dtx + "$");
        //BOUTON
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    if(mc.dc != null) dtx = getDialogValue(mc);
                    tx.setText("taux de conversion: 1euro = " + dtx + "$");
                    String txt = String.valueOf(primitiveConvert(Double.parseDouble(input.getText())));
                    output.setText(txt);
                }
                catch(Exception Ee) {JOptionPane.showMessageDialog(new JFrame(), "Entrez un nombre !!!", "Alerte", JOptionPane.ERROR_MESSAGE);}
            }
        });
        //AJOUT A LA FENETRE
        pan.add(euro, BorderLayout.CENTER);
        pan.add(input, BorderLayout.CENTER);
        pan.add(dollar, BorderLayout.CENTER);
        pan.add(output, BorderLayout.CENTER);
        pan.add(tx, BorderLayout.CENTER);
        pan.add(b, BorderLayout.SOUTH);
        //f.pack();
        f.setLayout(new GridLayout(2, 3));
        f.setJMenuBar(mc);
        f.setContentPane(pan);
        f.setVisible(true);
    }
}
