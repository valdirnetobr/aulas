
package javaapplication28;

import javax.swing.JOptionPane;


public class JavaApplication28 {

 
    public static void main(String[] args) {
         String sn1;
           double n1;
           sn1 = JOptionPane.showInputDialog(null,"digite um numero");
           n1 = Double.parseDouble(sn1);
           n1 = n1*n1*n1;
                   JOptionPane.showMessageDialog(null,"o valor em cubo é " + n1);
    }
    
}
