/* Desarrolle una aplicación que almacene números en una matriz de 5 * 6.
la cual debe almacenar los elementos de la matriz en un vector.
*/
package vector;
import javax.swing.JOptionPane;

public class Matriz {

 public static void main(String[] args) {
        int mat [][]=new int [10][10];
        int v[]=new int[40];
         int j=1, i=1,n=0;
         String ja="";
         String re="";
       
          for(i=1;i<=5;i++){
        for(j=1;j<=6;j++){
           mat[i][j]=Integer.parseInt(JOptionPane.showInputDialog("digite los numeros para pos: "+i +","+j));
        ja+=mat[i][j]+"\t  \t";
        v[n]=mat[i][j];
        re+=v[n]+"\t  \t  \t";
        n++;
        }
   
        ja+="\n";
       }
             JOptionPane.showMessageDialog(null,"matriz \n"+ja, "imprimiendo matriz",JOptionPane.INFORMATION_MESSAGE);
             JOptionPane.showMessageDialog(null,re,"imprimiendo vector",JOptionPane.INFORMATION_MESSAGE );
                       
    }
}
    

