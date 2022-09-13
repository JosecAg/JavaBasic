package Java;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class cicloFor {
    public static void main(String[] args){
        JTextArea area=new JTextArea(30,50);
        
        area.setText("Contador \n");
        int n=Integer.parseInt(JOptionPane.showInputDialog("Hasta desea contar"));
        
        for(int cont=1; cont<=n; cont++){
            area.append(cont+" \n");
        }
        JOptionPane.showInputDialog(null, area); 
    }
}
