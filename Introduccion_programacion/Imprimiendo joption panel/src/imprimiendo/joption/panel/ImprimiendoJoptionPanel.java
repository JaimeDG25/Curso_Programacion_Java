
package imprimiendo.joption.panel;

import javax.swing.JOptionPane;

public class ImprimiendoJoptionPanel {

    public static void main(String[] args) {
        
        String texto;
        int num; 
        char letra;
        double doble;
        
        texto=JOptionPane.showInputDialog("Ingrese algo rapido");
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero amigo"));
        letra= JOptionPane.showInputDialog("Ingrese algo rapido").charAt(0);
        doble= Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero amigo"));
        
        JOptionPane.showMessageDialog(null,"Tu texto es: "+texto);
        JOptionPane.showMessageDialog(null,"Tu numero es: "+num);
        JOptionPane.showMessageDialog(null,"Tu doble es: "+doble);
        JOptionPane.showMessageDialog(null,"Tu letra es: "+letra);
    }
     
}
