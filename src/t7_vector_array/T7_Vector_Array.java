/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7_vector_array;
import javax.swing.JOptionPane;
/**
 *
 * @author JeanR Pico
 */
public class T7_Vector_Array {

    /**
     * Ejercicio No. 7
Hacer un programa que tome uno a uno los elementos enteros de un arreglo unidimensional (vector, array)
llamado bases ya inicializado y en un segundo arreglo llamado resultados coloque el cuadrado de cada número
del arreglo bases en caso de ser par, o el cubo si es impar
     */
    public static void main(String[] args) 
    {
       int Bases[]=new int[6];
        int Resultados[]=new int[6];
        String rta="Potencias\nBases";
        
        
        for (int i = 0; i < Bases.length; i++) 
            {
                Bases[i]=(int)(Math.random()*6+1);
            }
        
        for (int i = 0; i < Bases.length; i++)
        {
            if (Bases[i]%2==0)
                {
                    Resultados[i]=(int)(Math.pow(Bases[i],2));
                }
            else
                {
                    Resultados[i]=(int)(Math.pow(Bases[i],3));
                }  
        }
        rta=rta+"= [";
        for (int i = 0; i <Bases.length; i++)
        {
            if(i!=(Bases.length-1))
            {
                 rta = rta +Bases[i]+",";
            }
            else
            {
                rta=rta+Bases[i];
            }
         }
         rta= rta+"]";
         
         rta= rta+"\nResultados= [";
        for (int i = 0; i <Resultados.length; i++)
        {
            if(i != (Resultados.length-1))
            {
                 rta = rta +Resultados[i]+",";
            }
            else
            {
                rta=rta+Resultados[i];
            }   
        }
        rta= rta+"]";
        JOptionPane.showMessageDialog(null,rta);
        //Fin
        System.exit(0);
    }
    
}
