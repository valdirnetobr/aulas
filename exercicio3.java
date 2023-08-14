
package javaapplication30;
import javax.swing.JOptionPane;
        import java.lang.Math;

public class JavaApplication30 {

    public static void main(String[] args) {
        String sn1;
           double n1,quadrado,res;
           sn1 = JOptionPane.showInputDialog(null,"digite um numero");
           n1 = Double.parseDouble(sn1);
           quadrado = n1*n1;
          res = Math.sqrt(n1);
         JOptionPane.showMessageDialog(null,"A raiz quadrada é "+ res+" e o quadrado é "+ quadrado);
         
   
    }
    
}
