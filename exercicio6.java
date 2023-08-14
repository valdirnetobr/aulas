
package javaapplication19;

import javax.swing.JOptionPane;

public class JavaApplication19 {

    public static void main(String[] args) {
        String sn1;
                double n1, res,res2;
                sn1 = JOptionPane.showInputDialog(null,"digite o salario sem acrescimo");
                n1 = Double.parseDouble(sn1);
                res = n1*15/100;
                res2= res+n1;
                JOptionPane.showMessageDialog(null,"O salario com acrescimo é " + res2);
                        
                        
                
       
    }
    
}
