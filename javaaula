package javaapplication47;
import javax.swing.JOptionPane;

public class JavaApplication47 {


    public static void main(String[] args) {
    
   double dia,apa,desc,vp,vlt,vlm,vlf,v;

    String dias, apas;
    dias=JOptionPane.showInputDialog(null,"Qual o valor da diaria sem o desconto? ");
    dia=Double.parseDouble(dias);
    apas=JOptionPane.showInputDialog(null,"Quantos apartamentos? ");
    apa=Double.parseDouble(apas);    
    desc=0.75;
    vp=dia*0.75;
    vlt=vp*apa;
    vlm=vlt*0.5;
    vlf=dia*apa;
    v=vlf-vlt;
    if(dia<=0 || apa<=0){
        JOptionPane.showMessageDialog(null, "Valores invalidos");
    }
    else{
    JOptionPane.showMessageDialog(null, "Valor promocional da diaria é "+vp);
    JOptionPane.showMessageDialog(null, "Valor total caso todos os apartamentos sejam ocupados é "+vlt);
    JOptionPane.showMessageDialog(null, "Valor caso a metade dos apartamentos sejam ocupados "+vlm);
    JOptionPane.showMessageDialog(null, "Valor que o hotel deixou de arrecadar  em virtude dos descontos "+v);
    }
    
    
    }
    
}
