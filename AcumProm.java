package Java;

import javax.swing.JOptionPane;

public class AcumProm {
public static void main(String[] args){
    int fact=1;
    int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un numero para su factorial: "));

    for(int cont=1; cont<=n; cont++){
        fact=fact*cont;
    }
    JOptionPane.showMessageDialog(null, fact);
}
}