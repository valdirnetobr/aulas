
package javaapplication18;
import javax.swing.JOptionPane;

public class JavaApplication18 {

    
    public static void main(String[] args) {
        double n1,res;
        
        String sn1;
        
     sn1 =  JOptionPane.showInputDialog(null,"digite o valor em real ");
     
     n1 = Double.parseDouble(sn1);
     
     res = n1/5;
     
     JOptionPane.showMessageDialog(null,"o valor em dolares é "+ res);
     
    }
    
}
