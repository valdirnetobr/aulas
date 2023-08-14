
package javaapplication17;

import javax.swing.JOptionPane;

public class JavaApplication17 {

    
    public static void main(String[] args) {
        
        double n1,n2,n3,soma,res;
        
        String sn1,sn2,sn3;
        
        sn1 = JOptionPane.showInputDialog(null,"digite o primeiro número.");
        sn2 = JOptionPane.showInputDialog(null,"digite o  segundo número");
        sn3 = JOptionPane.showInputDialog(null,"digite terceiro número");
        
        n1 = Double.parseDouble(sn1);
        n2 = Double.parseDouble(sn2);
        n3 = Double.parseDouble(sn3);
        
        soma = n1 + n2 + n3;
        
        res = soma * 3;
        
        JOptionPane.showMessageDialog(null,"o resultado é " + res );
        
    }
    
}
