/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;
import javax.swing.*;
import java.util.*;
 
public class OrdenarVector
{
        public static void main( String args[] )
        {
                int[] vector = new int[ 5 ];
 
                // Llamamos a los metodos
                llenarVector( vector );
                ordenarVector( vector );
                mostrarVector( vector );
        }
        public static void llenarVector( int[] vector )
        {
                String dato;
                int numero;
 
                for( int i = 0; i < vector.length; i ++ )
                {
                 // Leer datos del usuario, el dato ingresado se almacena en un String
               dato = JOptionPane.showInputDialog( "Ingrese dato Nro "+ ( i + 1 ) );
 
                        // Convertimos el dato ingresado  en un int
                        numero = Integer.parseInt( dato );
 
                        // Guardamos el dato ingresado en el vector
                        vector[ i ] = numero;
                }
 
        }
        public static void ordenarVector( int[] vector )
        {
                // Para ordenar vectores hay muchos metodos pero Java te
               // proporciona la clase Array con la que podras ordenar facilmente un
               // vector
 
                // Metodo sort que recibe como parametro un vector y lo ordena
                // asecendetemente.
                Arrays.sort( vector );
        }
 
        public static void mostrarVector( int[] vector )
        {
                // Recorremos cada posicion del vector y lo mostramos por consola
                for( int i = 0; i < vector.length; i ++ )
                        System.out.print( "  " + vector[ i ] );
        }
}
