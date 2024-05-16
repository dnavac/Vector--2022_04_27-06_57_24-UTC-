/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import javax.swing.JOptionPane;

/**
 *
 * @author DiegoN
 */
public class MatrizNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    float mat [][]=new float [11][6];
        int v[]=new int[40];
         int j=1, i=1;
         float n1,n2,n3,p;
         String ja="",nom;
         
        
        for (i=1;i<=5;i++){
          nom=JOptionPane.showInputDialog("digite el nombre de alumno "+ "["+i+"]");
          n1=Float.parseFloat(JOptionPane.showInputDialog("digite la nota [1]"));
          n2=Float.parseFloat(JOptionPane.showInputDialog("digite la nota [2]"));  
          n3=Float.parseFloat(JOptionPane.showInputDialog("digite la nota [3]"));
          
          p=(n1+n2+n3)/3;
          mat[i][j]=i;
          mat[i][j+1]=n1;
          mat[i][j+2]=n2;
          mat[i][j+3]=n3;
          mat[i][j+4]=p;
        }
        for (i=1;i<=10;i++){
        for  (j=1;j<=5;j++){
            ja=ja+mat[i][j]+"\t   \t   \t   \t  ";
        }
        ja+="\n";
        }
         JOptionPane.showMessageDialog(null," #lista   Nota1    Nota2    Nota3    Promedio \n"+ja);
        }
       
    }