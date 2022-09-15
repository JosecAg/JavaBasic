package Java;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class matrices {
    public static void main(String[] args){
        //Matriz
        JTextArea area=new JTextArea();
        area.setText("Arreglos unidimensionales\n");

        int[][] mat=new int[3][3];

            for(int c=0; c<3; c++){
                for(int f=0; f<3; f++){
                mat[c][f] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
                }
            }
            for(int c=0; c<3; c++){
                for(int f=0; f<3; f++){
                area.append(mat[f][c]+" ");
                }
            area.append("\n");
            }
            //Para sumar la diagonal principal:
            int sum=0;
            
            for(int c=0; c<3; c++){
                for(int f=0; f<3; f++){
                    if(f==c){
                        sum=sum+mat[f][c];
                    }
                }

            area.append("\n\n"+sum);
            JOptionPane.showMessageDialog(null, area);
            }
    }
}