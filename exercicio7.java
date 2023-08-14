
package javaapplication22;

import javax.swing.JOptionPane;


public class JavaApplication22 {

 
    public static void main(String[] args) {
 String sn1;
                double n1,res ,res2;
                sn1 = JOptionPane.showInputDialog(null,"digite o salario ");
                n1 = Double.parseDouble(sn1);
                res = n1*14/100;
                        res2 = n1-res;
                        JOptionPane.showMessageDialog(null,"O salario com desconto do INSS é " + res2 + " reais");
    }
    
}
