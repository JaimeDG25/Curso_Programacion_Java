
package pracctica;

import javax.swing.JOptionPane;


public class Pracctica {

  
    public static void main(String[] args) {
        int n1,n2,n3;
        double promedio;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota: 1"));
        if(n1 < 1 || n1 > 20) {
      JOptionPane.showMessageDialog(null, "La nota ingresada está fuera del rango permitido.");
      return; 
    }
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota: 2"));
        if(n2 < 1 || n2 > 20) {
      JOptionPane.showMessageDialog(null, "La nota ingresada está fuera del rango permitido.");
      return; 
    }
        n3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nota: 3"));
        if(n3 < 1 || n3 > 20) {
      JOptionPane.showMessageDialog(null, "La nota ingresada está fuera del rango permitido.");
      return;
    }
        promedio =(n1+n2+n3)/3 ; 
        if(promedio>11) {     
            JOptionPane.showMessageDialog(null, "Apruebas el curso con: "+promedio);
            
        } 
        else {
            JOptionPane.showMessageDialog(null, "No apruebas");
         
        }
    }   
}
