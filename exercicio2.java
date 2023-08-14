
package javaapplication27;

import javax.swing.JOptionPane;


public class JavaApplication27; {


    public static void main(String[] args) {
         String sn1,sn2;
           double n1,n2,res;
           sn1 = JOptionPane.showInputDialog(null,"digite o primeiro numero");
           n1 = Double.parseDouble(sn1);
           sn2 = JOptionPane.showInputDialog(null,"digite o segundo numero");
           
          n2 = Double.parseDouble(sn2);
           
           
           res = n1%n2;
                   JOptionPane.showMessageDialog(null,"o resto da divisao é " + res);
        
    }
    
}
