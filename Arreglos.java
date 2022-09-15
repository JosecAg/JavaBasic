package Java;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Arreglos {
    public static void main(String[] args){
        JTextArea area=new JTextArea();
        area.setText("Arreglos unidimensionales\n");

        int[] arreglo=new int[5];

            for(int i=0; i<5; i++){
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            }
            int sum=0;
            for(int i=0; i<5; i++){
                sum = sum + arreglo[i];
            }
            for(int i=0; i<5; i++){
                area.append(arreglo[i] + "\n");
            }
            area.append("\n\nLa suma de los numeros ingresados son: "+sum);
            JOptionPane.showMessageDialog(null, area);
            
    }
}